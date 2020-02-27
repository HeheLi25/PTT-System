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
import java.awt.Font;
import java.awt.Color;

public class classDirView2 extends JFrame {
	//public JFrame frame;
	private classDirController controllerObject;
	private classDirModel modelObject;
	private JPanel content;
	private JButton newBtnReturn;
	private JScrollPane sp;
	
	public JPanel getContent() {
		return content;
	}

	public classDirView2(classDirController controllerObject) {
		getContentPane().setFont(new Font("Corbel Light", Font.BOLD, 22));
		this.controllerObject = controllerObject;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,500);
		setLocation(100,100);
		setTitle("Class Director");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Requirements");
		lblNewLabel.setFont(new Font("Corbel", Font.BOLD, 25));
		lblNewLabel.setBounds(231, 21, 282, 34);
		getContentPane().add(lblNewLabel);
		
		content = new JPanel();
		
		
		
		
		JLabel lblCoursename = new JLabel("Course");
		lblCoursename.setForeground(new Color(0, 102, 102));
		lblCoursename.setFont(new Font("Corbel Light", Font.BOLD, 20));
		lblCoursename.setBounds(74, 73, 139, 29);
		getContentPane().add(lblCoursename);
		
		JLabel lblClassdirector = new JLabel("ClassDir");
		lblClassdirector.setFont(new Font("Corbel Light", Font.BOLD, 20));
		lblClassdirector.setForeground(new Color(51, 102, 153));
		lblClassdirector.setBounds(204, 73, 100, 29);
		getContentPane().add(lblClassdirector);
		
		JLabel lblBudget = new JLabel("Budget");
		lblBudget.setFont(new Font("Corbel Light", Font.BOLD, 20));
		lblBudget.setForeground(new Color(102, 102, 153));
		lblBudget.setBounds(325, 73, 100, 29);
		getContentPane().add(lblBudget);
		
		JLabel lblRequirement = new JLabel("Requirement");
		lblRequirement.setFont(new Font("Corbel Light", Font.BOLD, 20));
		lblRequirement.setForeground(new Color(153, 102, 153));
		lblRequirement.setBounds(452, 73, 117, 29);
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
		lblApproved.setFont(new Font("Corbel Light", Font.BOLD, 20));
		lblApproved.setForeground(new Color(204, 102, 102));
		lblApproved.setBounds(615, 72, 108, 30);
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
