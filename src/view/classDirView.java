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
import java.awt.Color;

public class classDirView extends JFrame {
	private classDirController controllerObject;
	private classDirModel modelObject;
	private JButton btnReturn, btnSave, btnView;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ArrayList<JTextField> reqArray = new ArrayList<JTextField>();
	
	public ArrayList<JTextField> getReqArray(){
		return reqArray;
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
		
		JLabel lblClass = new JLabel("Send a requirement");
		lblClass.setFont(new Font("Corbel", Font.BOLD, 25));
		lblClass.setBounds(233, 21, 264, 48);
		getContentPane().add(lblClass);
		
		textField = new JTextField();
		textField.setBounds(421, 97, 290, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		reqArray.add(textField);
		
		JLabel lblNewLabel = new JLabel("Course Name:");
		lblNewLabel.setForeground(new Color(51, 102, 102));
		lblNewLabel.setFont(new Font("Corbel Light", Font.BOLD, 24));
		lblNewLabel.setBackground(new Color(51, 102, 102));
		lblNewLabel.setBounds(150, 90, 192, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel lblClassDirector = new JLabel("Class Director:");
		lblClassDirector.setForeground(new Color(51, 102, 153));
		lblClassDirector.setFont(new Font("Corbel Light", Font.BOLD, 24));
		lblClassDirector.setBounds(150, 140, 164, 38);
		getContentPane().add(lblClassDirector);
		
		JLabel lblBudget = new JLabel("Budget:");
		lblBudget.setForeground(new Color(102, 102, 153));
		lblBudget.setFont(new Font("Corbel Light", Font.BOLD, 24));
		lblBudget.setBounds(150, 199, 141, 38);
		getContentPane().add(lblBudget);
		
		JLabel lblRequirement = new JLabel("Requirement:");
		lblRequirement.setForeground(new Color(153, 102, 153));
		lblRequirement.setFont(new Font("Corbel Light", Font.BOLD, 24));
		lblRequirement.setBounds(150, 255, 192, 38);
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
		
		btnSave = new JButton("Send");
		btnSave.setBounds(126, 344, 117, 29);
		btnSave.addActionListener(controllerObject);
		getContentPane().add(btnSave);
		
		btnReturn = new JButton("Logout");
		btnReturn.setBounds(295, 344, 117, 29);
		btnReturn.addActionListener(controllerObject);
		getContentPane().add(btnReturn);
		
		btnView = new JButton("View requirements");
		btnView.setBounds(464, 344, 247, 29);
		btnView.addActionListener(controllerObject);
		getContentPane().add(btnView);
	
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
