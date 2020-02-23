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
import view.ArrangedRFrame;

public class AdminController {
	public AdminFrame view;
	public JPanel panel;
	public JScrollPane sp;

	public AdminController(AdminFrame view) {
		this.view = view;
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
						ArrangedRFrame arf = new ArrangedRFrame(req);
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
