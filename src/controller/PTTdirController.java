package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;

import model.FileTool;
import model.PTTdirModel;
import model.Requirement;
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
			System.exit(0);
		}else {
			System.exit(0);
			}
	}
	public void setReq() {
		ArrayList<Requirement> allReq =  modelObject.getReqList();
		for(Requirement r : allReq) {
			
			JCheckBox cb = new JCheckBox(r.printInfo());
			if(r.isApproved()) cb.setEnabled(false);
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
		}
		
	}


}

