package controller;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import model.Arrangement;
import model.FileTool;
import view.AdminFrame;
import view.ArrangedRFrame;

public class ArrangedRController implements ActionListener{
	public ArrangedRFrame view;
	JPanel panel;
	JScrollPane sp;
	
	public ArrangedRController(ArrangedRFrame view) {
		this.view = view;
	}
	
	public void setArrangement() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1, 10, 10));
		sp = new JScrollPane(panel);
		sp.setBounds(10, 11, 521, 427);
		
		ArrayList<Arrangement> a = FileTool.readAllArr();
		
		for(Arrangement arr:a) {
			JPanel oneArrangement = new JPanel(new GridLayout(0,1,1,1));
			JLabel courseName = new JLabel("CourseName: "+arr.getRequirement().getCourseName());
			JLabel requirement = new JLabel("Requirement: "+arr.getRequirement().getRequirement());
			JLabel staffLabel,trainingLabel;
			
			ArrayList<String> staffs = arr.getStaffs();
			ArrayList<String> trainings = arr.getTraining();
			
			staffLabel = new JLabel("Staff: "+staffs.toString());
			trainingLabel = new JLabel("Training course: "+trainings.toString());
			
			oneArrangement.add(courseName);
			oneArrangement.add(requirement);
			oneArrangement.add(staffLabel);
			oneArrangement.add(trainingLabel);
			
			oneArrangement.setBorder(new LineBorder(new Color(0, 0, 128)));
			
			panel.add(oneArrangement);
		}
		
		view.contentPanel.add(sp);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// back to Administrator page
		if(e.getSource() == view.back) {
			view.dispose();
			AdminFrame af = new AdminFrame();
			af.setVisible(true);
		}
		
	}
}
