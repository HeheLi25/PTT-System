package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import model.PTTdirModel;
import view.PTTdirFrame;

public class PTTdirController implements ActionListener,ItemListener{
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
			viewObject.updateView();
		}else if(e.getSource() == viewObject.getBtnHome()){
			System.exit(0);
		}else {
			System.exit(0);
			}
			

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		for(int i =0;i<modelObject.getReqList().size();i++) {
			if(modelObject.getReqList().get(i).getCheckBox().isSelected()) {
				modelObject.getReqList().get(i).setApproved(true);
				
			}else {
				modelObject.getReqList().get(i).setApproved(false);
			
			}
			
		}
	}
}

