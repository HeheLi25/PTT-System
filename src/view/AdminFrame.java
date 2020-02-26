package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AdminController;
import model.Requirement;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AdminFrame extends JFrame {

	private JPanel contentPanel;
	private JScrollPane sp;
	private JPanel panel;
	private AdminController controller;
	
	private JButton back;
	private JButton pervious;
	


	/**
	 * Create the frame.
	 */
	public AdminFrame() {
		controller = new AdminController(this);
		setTitle("Administrator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
		setLocationRelativeTo(null);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		JLabel requireTitle = new JLabel("Requirement");
		requireTitle.setBackground(new Color(224, 255, 255));
		requireTitle.setForeground(new Color(51, 51, 153));
		requireTitle.setFont(new Font("Corbel Light", Font.BOLD, 22));
		requireTitle.setBounds(360, 22, 159, 39);
		contentPanel.add(requireTitle);

		JLabel arrangeLabel = new JLabel("to arrange");
		arrangeLabel.setForeground(new Color(102, 51, 153));
		arrangeLabel.setBackground(new Color(255, 0, 0));
		arrangeLabel.setFont(new Font("Corbel Light", Font.BOLD, 22));
		arrangeLabel.setBounds(544, 23, 142, 36);
		contentPanel.add(arrangeLabel);

		JButton seePreButton = new JButton("Previous Arrangements");
		seePreButton.setBackground(new Color(245, 245, 245));
		seePreButton.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 25));
		seePreButton.setForeground(new Color(51, 153, 102));
		seePreButton.setBounds(64, 355, 302, 71);
		this.pervious = seePreButton;
		pervious.addActionListener(controller);
		contentPanel.add(seePreButton);

		JButton backButton = new JButton("Logout");
		backButton.setBackground(new Color(245, 245, 245));
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 25));
		backButton.setBounds(574, 362, 159, 57);
		this.back = backButton;
		back.addActionListener(controller);
		contentPanel.add(backButton);
		
		JLabel courseNameTitle = new JLabel("CourseName");
		courseNameTitle.setForeground(new Color(51, 153, 153));
		courseNameTitle.setFont(new Font("Corbel Light", Font.BOLD, 22));
		courseNameTitle.setBackground(new Color(224, 255, 255));
		courseNameTitle.setBounds(29, 22, 159, 39);
		contentPanel.add(courseNameTitle);
		
		JLabel classDir = new JLabel("ClassDir");
		classDir.setForeground(new Color(51, 102, 153));
		classDir.setFont(new Font("Corbel Light", Font.BOLD, 22));
		classDir.setBackground(Color.RED);
		classDir.setBounds(198, 23, 123, 36);
		contentPanel.add(classDir);

		controller.createRequirement();

//		// requireLabel 1
//		JLabel courseName1 = new JLabel("1");
//		JLabel classDir = new JLabel("C");
//		JLabel requireLabel1 = new JLabel("Requirem");
//		requireLabel1.setBounds(10, 6, 385, 39);
//
//		requireLabel1.setFont(new Font("Tahoma", Font.PLAIN, 13));
//
//		panel.add(courseName1);
//		panel.add(classDir);
//		panel.add(requireLabel1);
//		// requireButton1
//		JButton requireButton1 = new JButton("Arrange");
//		requireButton1.setBounds(431, 11, 107, 31);
//
//		requireButton1.setFont(new Font("Dialog", Font.PLAIN, 13));
//		panel.add(requireButton1);

//		// requirementLabel 2
//		JLabel requireLabel2 = new JLabel("Requirement 2 will appear there");
//		requireLabel2.setBounds(10, 6, 385, 39);
//		requireLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//
//		panel.add(requireLabel2);
//
//		// requireButton2
//		JButton requireButton2 = new JButton("Arrange");
//		requireButton2.setBounds(432, 11, 107, 31);
//		requireButton2.setFont(new Font("Dialog", Font.PLAIN, 17));
//		panel.add(requireButton2);
//
//
//		JLabel requireLabel3 = new JLabel("Requirement 3 will appear there");
//		requireLabel3.setBounds(10, 16, 385, 22);
//		requireLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		
//		panel.add(requireLabel3);
//
//		JButton requireButton3 = new JButton("Arrange");
//		requireButton3.setBounds(433, 16, 107, 31);
//		requireButton3.setFont(new Font("Dialog", Font.PLAIN, 17));
//		
//		panel.add(requireButton3);
//		
//
//
//
//		JLabel requireLabel4 = new JLabel("Requirement 4 will appear there");
//		requireLabel4.setBounds(10, 11, 385, 31);
//		requireLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		panel.add(requireLabel4);
//		
//		JButton requireButton4 = new JButton("Arrange");
//		requireButton4.setBounds(433, 12, 107, 31);
//		requireButton4.setFont(new Font("Dialog", Font.PLAIN, 17));
//		panel.add(requireButton4);
//
//		JLabel requireLabel5 = new JLabel("Requirement 5 will appear there");
//		requireLabel5.setBounds(10, 11, 385, 31);
//		requireLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		panel.add(requireLabel5);
//
//		JButton requireButton5 = new JButton("Arrange");
//		requireButton5.setBounds(432, 12, 107, 31);
//		requireButton5.setFont(new Font("Dialog", Font.PLAIN, 17));
//		panel.add(requireButton5);
		
	}



	public JPanel getContentPanel() {
		return contentPanel;
	}
	public JScrollPane getSp() {
		return sp;
	}
	public JPanel getPanel() {
		return panel;
	}
	public AdminController getController() {
		return controller;
	}
	public JButton getBack() {
		return back;
	}
	public JButton getPervious() {
		return pervious;
	}
	
}
