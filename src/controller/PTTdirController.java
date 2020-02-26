package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.FileTool;
import model.PTTdirModel;
import model.Requirement;
import view.HomeFrame;
import view.PTTdirFrame;

public class PTTdirController implements ActionListener{
	private PTTdirFrame viewObject;
	private PTTdirModel modelObject;
	
	public PTTdirController(PTTdirModel model) {
		modelObject = model;
	}

	public void setView(PTTdirFrame view) {
		viewObject = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == viewObject.getBtnSave()) {
			modelObject.writeIn();
			viewObject.reinitialize();
		}else if(e.getSource() == viewObject.getBtnHome()){
			viewObject.getFrame().dispose();
			HomeFrame hf = new HomeFrame();
			hf.setVisible(true);
		}
	}
	public void setReq() {
		ArrayList<Requirement> allReq =  modelObject.getReqList();
		for(Requirement r : allReq) {
			
			JCheckBox cb = new JCheckBox(r.getCourseName());
			if(r.isApproved()) {
				cb.setSelected(true);
				cb.setEnabled(false);
			}
			JLabel l1 = new JLabel(r.getClassDir());
			JLabel l2 = new JLabel(r.getBudget()+"");
			JLabel l3 = new JLabel(r.getRequirement());
			JLabel l4 = new JLabel(String.format("%20s", r.isApproved()+""));
			cb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox checkBox = (JCheckBox) e.getSource();
					if (checkBox.isSelected()) {
						r.setApproved(true);
					} else {
						r.setApproved(false);
					}
					modelObject.setReqList(allReq);
				}
			});
			viewObject.getReqPanel().add(cb);
			viewObject.getReqPanel().add(l1);
			viewObject.getReqPanel().add(l2);
			viewObject.getReqPanel().add(l3);
			viewObject.getReqPanel().add(l4);
		}
		
	}


}

