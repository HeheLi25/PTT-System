package controller;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.FileTool;
import model.Requirement;
import view.AdminFrame;
import view.ArrangeFrame;
import view.ArrangedRFrame;
import view.HomeFrame;

public class AdminController implements ActionListener{
	public AdminFrame view;
	public JPanel panel;
	public JScrollPane sp;

	public AdminController(AdminFrame view) {
		this.view = view;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.back) {
			view.dispose();
			HomeFrame hf = new HomeFrame();
			hf.setVisible(true);
		}
		//see previous arrangement page
		if(e.getSource() == view.pervious) {
			view.dispose();
			ArrangedRFrame arf = new ArrangedRFrame();
			arf.setVisible(true);
		}
		
	}

	public void createRequirement() {
		panel = new JPanel();
		panel.setBounds(48, 61, 643, 281);
		panel.setLayout(new GridLayout(0, 4, 1, 1));
		sp = new JScrollPane(panel);
		sp.setBounds(67, 61, 624, 279);

		ArrayList<Requirement> r = FileTool.readAllReq();

		for (Requirement req : r) {
			if (!req.isArranged()) {
				JLabel courseName = new JLabel(req.getCourseName());
				JLabel classDir = new JLabel(req.getClassDir());
				JLabel requirement = new JLabel(req.getRequirement());
				JButton arrangeButton = new JButton("Arrange");
				arrangeButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						view.dispose();
						ArrangeFrame arf = new ArrangeFrame(req);
						arf.setVisible(true);
					}
				});
				panel.add(courseName);
				panel.add(classDir);
				panel.add(requirement);
				panel.add(arrangeButton);
			}
			else {
				JLabel courseName = new JLabel(req.getCourseName());
				JLabel classDir = new JLabel(req.getClassDir());
				JLabel requirement = new JLabel(req.getRequirement());
				JLabel arranged = new JLabel("Arranged");
				panel.add(courseName);
				panel.add(classDir);
				panel.add(requirement);
				panel.add(arranged);
			}
			
		}

		view.contentPanel.add(sp);

	}


}
