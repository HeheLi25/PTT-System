package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controller.ArrangeController;
import model.FileTool;
import model.Requirement;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class ArrangeFrame extends JFrame {

	public JPanel contentPanel;
	public Requirement req;
	public ArrangeController controller;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrangeFrame frame = new ArrangeFrame(new Requirement("course0","name1",0.0,"i want a tutor "));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArrangeFrame(Requirement req) {
		this.req = req;
		controller = new ArrangeController(this);
		setTitle("Arrangement Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		controller.setRequirementTitle();
		
		JLabel staffTitleLabel = new JLabel("Staff");
		staffTitleLabel.setForeground(new Color(34, 139, 34));
		staffTitleLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		staffTitleLabel.setBounds(88, 75, 101, 35);
		contentPanel.add(staffTitleLabel);
		
		
		
		
		JLabel courseTitleLabel = new JLabel("Training Course");
		courseTitleLabel.setForeground(new Color(34, 139, 34));
		courseTitleLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		courseTitleLabel.setBounds(483, 75, 225, 35);
		contentPanel.add(courseTitleLabel);
		
		JButton ArrangeBackButton = new JButton("Back");
		ArrangeBackButton.addActionListener(controller);
		ArrangeBackButton.setBackground(new Color(128, 128, 128));
		ArrangeBackButton.setForeground(new Color(0, 0, 0));
		ArrangeBackButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 25));
		ArrangeBackButton.setBounds(10, 11, 114, 52);
		this.back = ArrangeBackButton;
		contentPanel.add(ArrangeBackButton);
		
		JButton arrangeSubmitButton = new JButton("Submit");
		arrangeSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		arrangeSubmitButton.setBackground(new Color(255, 165, 0));
		arrangeSubmitButton.setForeground(new Color(255, 0, 0));
		arrangeSubmitButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 25));
		arrangeSubmitButton.setBounds(569, 397, 139, 52);
		contentPanel.add(arrangeSubmitButton);
		
		controller.setStaff();
		controller.setTraining();
	}
}
