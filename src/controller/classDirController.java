package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;

import model.Requirement;
import model.classDirModel;
import view.classDirView;
import view.classDirView2;

public class classDirController  implements ActionListener {
	private classDirView viewObject;
	private classDirModel modelObject;
	private classDirView2 viewObject2;
	public JScrollPane sp;
	ArrayList<Requirement> allReq;
	Requirement req;

	
	public classDirController(classDirModel model) {
		modelObject = model;

	}
	
	public void setView(classDirView view) {
		viewObject = view;
		viewObject.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == viewObject.getBtnSave()) {
			try {
				modelObject.save("Requirement.txt", viewObject.reqArray);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			viewObject.reLayoutComponents();
		}else if(e.getSource() == viewObject.getBtnReturn()) {
			System.exit(0);
		}else if(e.getSource() == viewObject.getBtnView()) {
			classDirView2 v = new classDirView2();
			v.setVisible(true);
			String s = modelObject.getReqList().toString();
			v.textField.setText(s);
			//modelObject.getReqList();
		}else if(e.getSource() == viewObject2.getNewBtnReturn()) {
			classDirView v2 = new classDirView(this, modelObject);
			v2.setVisible(true);
			
		}else {
			System.exit(0);
		}

		
		
	}
	
	

}
