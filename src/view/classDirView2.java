package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.classDirController;
import model.classDirModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class classDirView2 extends JFrame {
	//public JFrame frame;
	public classDirController controllerObject;
	public classDirModel modelObject;
	public JTextField textField;
	public JButton newBtnReturn;
	public JScrollPane sp;

	public classDirView2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,500);
		setLocation(100,100);
		setTitle("Class Director");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Requirements");
		lblNewLabel.setBounds(343, 23, 144, 16);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(74, 116, 661, 274);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCoursename = new JLabel("CourseName");
		lblCoursename.setBounds(74, 78, 92, 16);
		getContentPane().add(lblCoursename);
		
		JLabel lblClassdirector = new JLabel("ClassDir");
		lblClassdirector.setBounds(259, 78, 61, 16);
		getContentPane().add(lblClassdirector);
		
		JLabel lblBudget = new JLabel("Budget");
		lblBudget.setBounds(434, 78, 61, 16);
		getContentPane().add(lblBudget);
		
		JLabel lblRequirement = new JLabel("Requirement");
		lblRequirement.setBounds(596, 78, 92, 16);
		getContentPane().add(lblRequirement);
		
		newBtnReturn = new JButton("Return");
		newBtnReturn.setBounds(351, 420, 117, 29);
		newBtnReturn.addActionListener(controllerObject);
		getContentPane().add(newBtnReturn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(712, 116, 19, 268);
		getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		//panel.setLayout(new GridLayout(modelObject.getReqList().size()+1, 1, 0, 0));
		
  
		
		
	}
	
	public JButton getNewBtnReturn() {
		return newBtnReturn;
	}
	
	public void setNewBtnReturn(JButton newBtnReturn) {
		this.newBtnReturn = newBtnReturn;
	}
}
