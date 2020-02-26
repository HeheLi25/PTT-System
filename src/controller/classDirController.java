package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.FileTool;
import model.Requirement;
import model.classDirModel;
import view.HomeFrame;
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
	public void setView2(classDirView2 view) {
		viewObject2 = view;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == viewObject.getBtnSave()) {
			try {
				String[] s = new String[4];
				ArrayList<JTextField> result = viewObject.getReqArray();
				int count = 0;
				for(JTextField tf: result) {
					s[count++] = tf.getText();
				}
				Requirement r = new Requirement(s[0],s[1],Double.parseDouble(s[2]),s[3]);
				FileTool.writeOneReq(r);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null,"Success.");
			viewObject.clearText();
		}else if(e.getSource() == viewObject.getBtnReturn()) {
			viewObject.dispose();
			HomeFrame hf = new HomeFrame();
			hf.setVisible(true);
			
		}else if(e.getSource() == viewObject.getBtnView()) {
			viewObject.dispose();
			classDirView2 v = new classDirView2(this);
			viewObject2 = v;
			v.setVisible(true);
			modelObject.setReqList();
			ArrayList<Requirement> list = modelObject.getReqList();
			for(Requirement r: list) {
				JLabel course = new JLabel(r.getCourseName());
				JLabel director = new JLabel(r.getClassDir());
				JLabel budget = new JLabel(r.getBudget()+"");
				JLabel requirement = new JLabel(r.getRequirement());
				JLabel approve = new JLabel(String.format("%20s", r.isApproved()+""));
				if(r.isApproved()) approve.setForeground(new Color(0, 150, 0));
				viewObject2.getContent().add(course);
				viewObject2.getContent().add(director);
				viewObject2.getContent().add(budget);
				viewObject2.getContent().add(requirement);
				viewObject2.getContent().add(approve);
			}
		}else if(e.getSource() == viewObject2.getNewBtnReturn()) {
			viewObject2.dispose();
			viewObject = new classDirView(this, modelObject);
			viewObject.setVisible(true);
			
		}else {
			System.exit(0);
		}

		
		
	}
	
	

}
