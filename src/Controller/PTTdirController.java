package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import View.PTTdirFrame;
import model.PTTdirModel;

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
		//if(e.getSource() == viewObject.getBtnSave()) {
			
	//		}
	//	}else if (e.getSource() == viewObject.buttonNew) {
			
	//	}else {
	//		System.exit(0);
			

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		for(int i =0;i<modelObject.getReqList().size();i++) {
			if(modelObject.getReqList().get(i).getCheckBox().isSelected()) {
				modelObject.getReqList().get(i).setApproved(true);
				modelObject.writeIn();
			}else {
				modelObject.getReqList().get(i).setApproved(false);
				modelObject.writeIn();
			}
			
		}
	}
}

