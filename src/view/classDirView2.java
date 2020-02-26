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
	private classDirController controllerObject;
	public classDirModel modelObject;
	private JPanel content;
	public JButton newBtnReturn;
	public JScrollPane sp;
	
	public JPanel getContent() {
		return content;
	}

	public classDirView2(classDirController controllerObject) {
		this.controllerObject = controllerObject;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,500);
		setLocation(100,100);
		setTitle("Class Director");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Requirements");
		lblNewLabel.setBounds(343, 23, 144, 16);
		getContentPane().add(lblNewLabel);
		
		content = new JPanel();
		
		
		
		
		JLabel lblCoursename = new JLabel("CourseName");
		lblCoursename.setBounds(74, 78, 92, 16);
		getContentPane().add(lblCoursename);
		
		JLabel lblClassdirector = new JLabel("ClassDir");
		lblClassdirector.setBounds(204, 78, 61, 16);
		getContentPane().add(lblClassdirector);
		
		JLabel lblBudget = new JLabel("Budget");
		lblBudget.setBounds(325, 78, 61, 16);
		getContentPane().add(lblBudget);
		
		JLabel lblRequirement = new JLabel("Requirement");
		lblRequirement.setBounds(452, 78, 92, 16);
		getContentPane().add(lblRequirement);
		
		newBtnReturn = new JButton("Return");
		newBtnReturn.setBounds(351, 420, 117, 29);
		newBtnReturn.addActionListener(controllerObject);
		getContentPane().add(newBtnReturn);
		
		JScrollPane scrollPane = new JScrollPane();
		content.setLayout(new GridLayout(0,5));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(74, 105, 657, 279);
		getContentPane().add(scrollPane);
		
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(content);
		
		JLabel lblApproved = new JLabel("Approved");
		lblApproved.setBounds(623, 79, 92, 16);
		getContentPane().add(lblApproved);
		//panel.setLayout(new GridLayout(modelObject.getReqList().size()+1, 1, 0, 0));
		
  
		
		
	}
	
	public JButton getNewBtnReturn() {
		return newBtnReturn;
	}
	
	public void setNewBtnReturn(JButton newBtnReturn) {
		this.newBtnReturn = newBtnReturn;
	}
}
