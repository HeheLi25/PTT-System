package controller;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import model.FileTool;
import model.Requirement;

import view.PTTdirFrame;

public class PTTdirController implements ActionListener{
	private PTTdirFrame view;
	public JScrollPane reSc;
	public JPanel rePanel;
	Requirement req;
	ArrayList<Requirement> allReqs;

	
	public PTTdirController(PTTdirFrame view) {
		this.view = view;
		this.allReqs = view.getAllReq();


	}
	
	public void setRequirement() {
		
		this.allReqs = FileTool.readAllReq();
		
		rePanel = new JPanel();
		rePanel.setLayout(new GridLayout(allReqs.size()+1, 1, 1, 1));
		reSc = new JScrollPane(rePanel);
		reSc .setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		reSc .setBounds(52, 89, 690, 310);
		
		
		String a =String.format("%25s%20s%18s%25s","CourseName","ClassDir","Budget","Requirement");
		JLabel firstLabel = new JLabel(a);
		rePanel.add(firstLabel);
		

		
		for (Requirement r : allReqs) {
			JCheckBox b = new JCheckBox(r.printInfo());
			if(r.isApproved()) b.setEnabled(false);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox checkBox = (JCheckBox) e.getSource();
					if(checkBox.isSelected()) {
						r.setApproved(true);
						
					}else {
						r.setApproved(false);
					}
					view.setAllReq(allReqs);
				}
			});
			
			rePanel.add(b);
		}
		view.getContentPanel().add(reSc);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.getBtnSave()) {
			view.upDate();;
		}else if(e.getSource() == view.getBtnHome()){
			System.exit(0);
		}else {
			System.exit(0);
			}
			
		
	}





}

