package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import controller.*;
import model.*;
import javax.swing.JTextField;

public class classDirView extends JFrame {
	private classDirController controllerObject;
	private classDirModel modelObject;
	public JButton btnReturn, btnSave, btnView;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	private ArrayList<JTextField> reqArray = new ArrayList<JTextField>();
	
	public ArrayList<JTextField> getReqArray(){
		return reqArray;
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classDirModel model = new classDirModel();
					classDirController controller = new classDirController(model);
					classDirView view = new classDirView(controller, model);
					controller.setView(view);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			});
				
	}
	
	public classDirView(classDirController controller, classDirModel model) {
		controllerObject = controller;
		modelObject = model;
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,500);
		setLocation(100,100);
		setTitle("Class Director");
		getContentPane().setLayout(null);
		layoutComponents();
	}
	
	public void layoutComponents() {
		
		JLabel lblClass = new JLabel("Class Director GUI");
		lblClass.setBounds(339, 28, 122, 16);
		getContentPane().add(lblClass);
		
		textField = new JTextField();
		textField.setBounds(421, 97, 290, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		reqArray.add(textField);
		
		JLabel lblNewLabel = new JLabel("Course Name:");
		lblNewLabel.setBounds(150, 102, 130, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblClassDirector = new JLabel("Class Director:");
		lblClassDirector.setBounds(150, 155, 109, 16);
		getContentPane().add(lblClassDirector);
		
		JLabel lblBudget = new JLabel("Budget:");
		lblBudget.setBounds(149, 211, 84, 16);
		getContentPane().add(lblBudget);
		
		JLabel lblRequirement = new JLabel("Requirement:");
		lblRequirement.setBounds(149, 263, 84, 16);
		getContentPane().add(lblRequirement);
		
		textField_1 = new JTextField();
		textField_1.setBounds(421, 150, 290, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		reqArray.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(421, 206, 290, 26);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		reqArray.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(421, 258, 290, 26);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		reqArray.add(textField_3);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(187, 390, 117, 29);
		btnSave.addActionListener(controllerObject);
		getContentPane().add(btnSave);
		
		btnReturn = new JButton("Return");
		btnReturn.setBounds(363, 390, 117, 29);
		btnReturn.addActionListener(controllerObject);
		getContentPane().add(btnReturn);
		
		btnView = new JButton("View");
		btnView.setBounds(547, 390, 117, 29);
		btnView.addActionListener(controllerObject);
		getContentPane().add(btnView);
		
		System.out.println(reqArray);
	
	}
	
	public void reLayoutComponents() {
		classDirModel model = new classDirModel();
		classDirController controller = new classDirController(model);
		classDirView view = new classDirView(controller, model);
		controller.setView(view);
		layoutComponents();
	}
	public void clearText() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
	}
	
	public JButton getBtnView() {
		return btnView;
	}
	
	public void setBtnView(JButton btnView) {
		this.btnView = btnView;
	}
	
	public JButton getBtnReturn() {
		return btnReturn;
	}
	
	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}
	
	public JButton getBtnSave() {
		return btnSave;
	}
	
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
}
