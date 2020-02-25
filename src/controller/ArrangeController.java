package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import model.Arrangement;
import model.FileTool;
import model.Requirement;
import view.AdminFrame;
import view.ArrangeFrame;

public class ArrangeController implements ActionListener{
	public ArrangeFrame view;
	public JLabel requireLabel;
	ArrayList<Requirement> allReq;
	Requirement req;
	public JPanel staffPanel, trainingPanel;
	public JScrollPane staffsp, trainingsp;
	private ArrayList<String> staffs;
	private ArrayList<String> training;
	
	public ArrangeController(ArrangeFrame view) {
		this.view = view;
		this.req = view.getReq();
		this.allReq = view.getAllReq();
		staffs = new ArrayList<String>();
		training = new ArrayList<String>();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getBack()) {
			view.dispose();
			AdminFrame af = new AdminFrame();
			af.setVisible(true);
		}
		if(e.getSource() == view.getSubmit()) {
			if(staffs.size()<1 || training.size()<1) {
				JOptionPane.showMessageDialog(null, "You must choose at least one staff and one training course.", "Alert", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			Arrangement a = new Arrangement(req);
			a.setStaffs(staffs);
			a.setTraining(training);
			FileTool.writeOneArr(a);
			req.setArranged(true);
			FileTool.overWriteReq(allReq);
			JOptionPane.showMessageDialog(null,"Arrangement complete");
			view.dispose();
			AdminFrame af = new AdminFrame();
			af.setVisible(true);
		}
		
	}
	
	
	public void setRequirementTitle() {
		requireLabel = new JLabel(req.getCourseName()+" - \""+req.getRequirement()+"\"");
		requireLabel.setFont(new Font("Corbel", Font.PLAIN, 22));
		requireLabel.setForeground(new Color(51, 153, 120));
		requireLabel.setBounds(232, 11, 346, 52);
		view.getContentPanel().add(requireLabel);
	}
	public void setStaff() {
		staffPanel = new JPanel();
		//staffPanel.setBounds(48, 61, 643, 281);
		staffPanel.setLayout(new GridLayout(0, 1, 1, 1));
		staffsp = new JScrollPane(staffPanel);
		staffsp.setBounds(38, 110, 243, 273);
		
		ArrayList<String> allStaffs = FileTool.readFile("staffs");
		
		for (String staff : allStaffs) {
			JCheckBox name = new JCheckBox(staff);
			name.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox checkBox = (JCheckBox) e.getSource();
					if (checkBox.isSelected()) {
						staffs.add(checkBox.getText());
					} else {
						staffs.remove(checkBox.getText());
					}
				}
			});
			
			staffPanel.add(name);
		}
		view.getContentPanel().add(staffsp);
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
			courseName.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox checkBox = (JCheckBox) e.getSource();
					if (checkBox.isSelected()) {
						training.add(checkBox.getText());
					} else {
						training.remove(checkBox.getText());
					}
				}
			});
			trainingPanel.add(courseName);
		}
		view.getContentPanel().add(trainingsp);
	}

	
	
	
	
	
	

}
