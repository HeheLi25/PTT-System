package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.HomeController;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeFrame extends JFrame {

	private JPanel contentPanel;
	private JButton adminButton, classDirButton, PTTDirButton;
	private HomeController controller;

	/**
	 * Create the frame.
	 */
	public HomeFrame() {
		this.controller = new HomeController(this);
		setTitle("HomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
		setLocationRelativeTo(null);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel homeTitleLabel = new JLabel("---- Choose your position ----");
		homeTitleLabel.setForeground(new Color(51, 102, 153));
		homeTitleLabel.setFont(new Font("Corbel Light", Font.BOLD, 37));
		homeTitleLabel.setBounds(128, 21, 500, 77);
		contentPanel.add(homeTitleLabel);
		
		JButton CDButton = new JButton("Class Director");
		CDButton.setForeground(new Color(102, 102, 153));
		CDButton.setFont(new Font("Constantia", Font.PLAIN, 27));
		CDButton.setBounds(231, 109, 291, 58);
		CDButton.addActionListener(controller);
		this.classDirButton = CDButton;
		contentPanel.add(CDButton);
		
		JButton PTTDButton = new JButton("PTT Director");
		PTTDButton.setForeground(new Color(102, 102, 153));
		PTTDButton.setFont(new Font("Constantia", Font.PLAIN, 27));
		PTTDButton.setBounds(231, 199, 291, 58);
		PTTDButton.addActionListener(controller);
		this.PTTDirButton = PTTDButton;
		contentPanel.add(PTTDButton);
		
		JButton AdminButton = new JButton("Administrator");
		AdminButton.setForeground(new Color(102, 102, 153));
		AdminButton.setFont(new Font("Constantia", Font.PLAIN, 27));
		AdminButton.setBounds(231, 293, 291, 58);
		AdminButton.addActionListener(controller);
		this.adminButton = AdminButton;
		contentPanel.add(AdminButton);
	}
	public void close() {
		this.dispose();
	}
	public JPanel getContentPanel() {
		return contentPanel;
	}
	public JButton getAdminButton() {
		return adminButton;
	}
	public JButton getClassDirButton() {
		return classDirButton;
	}
	public JButton getPTTDirButton() {
		return PTTDirButton;
	}
	public HomeController getController() {
		return controller;
	}

}
