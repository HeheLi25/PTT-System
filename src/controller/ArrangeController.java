package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.FileTool;
import model.Requirement;
import view.AdminFrame;
import view.ArrangeFrame;

public class ArrangeController implements ActionListener{
	public ArrangeFrame view;
	public JLabel requireLabel;
	Requirement req;
	public JPanel staffPanel, trainingPanel;
	public JScrollPane staffsp, trainingsp;
	
	public ArrangeController(ArrangeFrame view) {
		this.view = view;
		this.req = view.req;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.back) {
			view.dispose();
			AdminFrame af = new AdminFrame();
			af.setVisible(true);
		}
		
	}
	
	
	public void setRequirementTitle() {
		requireLabel = new JLabel(req.getRequirement());
		requireLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 27));
		requireLabel.setForeground(new Color(128, 0, 128));
		requireLabel.setBounds(232, 11, 346, 52);
		view.contentPanel.add(requireLabel);
	}
	public void setStaff() {
		staffPanel = new JPanel();
		//staffPanel.setBounds(48, 61, 643, 281);
		staffPanel.setLayout(new GridLayout(0, 1, 1, 1));
		staffsp = new JScrollPane(staffPanel);
		staffsp.setBounds(38, 110, 243, 273);
		
		ArrayList<String> staffs = FileTool.readFile("staffs");
		
		for(String staff:staffs) {
			JCheckBox name = new JCheckBox(staff);
			staffPanel.add(name);
		}
		view.contentPanel.add(staffsp);
	}
	public void setTraining() {
		trainingPanel = new JPanel();
		//trainingPanel.setBounds(48, 61, 643, 281);
		trainingPanel.setLayout(new GridLayout(0, 1, 1, 1));
		trainingsp = new JScrollPane(trainingPanel);
		trainingsp.setBounds(398, 114, 368, 273);
		
		ArrayList<String> trainings = FileTool.readFile("training");
		
		for(String t: trainings) {
			JCheckBox courseName = new JCheckBox(t);
			trainingPanel.add(courseName);
		}
		view.contentPanel.add(trainingsp);
	}

	
	
	
	
	
	

}
