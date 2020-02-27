package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.LoginController;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class LoginFrame extends JFrame{
	private JTextField username;
	private JPasswordField password;
	private JButton login;
	private String position;
	private HomeFrame homeFrame;
	
	public JTextField getUsername() {
		return username;
	}
	public JTextField getPassword() {
		return password;
	}
	public JButton getLogin() {
		return login;
	}
	public String getPosition() {
		return position;
	}
	public void closeHomeFrame() {
		homeFrame.close();
	}
	public void reset() {
		username.setText("");
		password.setText("");
	}
	private LoginController controller;
	
	public LoginFrame(HomeFrame homeFrame,String position) {
		this.homeFrame = homeFrame;
		this.position = position;
		this.controller = new LoginController(this);
		setTitle("Login");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{89, 80, 211, 0};
		gridBagLayout.rowHeights = new int[]{65, 50, 50, 73, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		JLabel title = new JLabel("Login as "+position);
		title.setForeground(new Color(102, 102, 153));
		title.setFont(new Font("Corbel", Font.PLAIN, 24));
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.anchor = GridBagConstraints.SOUTH;
		gbc_title.insets = new Insets(0, 0, 5, 0);
		gbc_title.gridwidth = 2;
		gbc_title.gridx = 1;
		gbc_title.gridy = 0;
		getContentPane().add(title, gbc_title);
		
		JLabel label1 = new JLabel("username");
		label1.setFont(new Font("Corbel Light", Font.PLAIN, 20));
		GridBagConstraints gbc_label1 = new GridBagConstraints();
		gbc_label1.anchor = GridBagConstraints.SOUTH;
		gbc_label1.fill = GridBagConstraints.HORIZONTAL;
		gbc_label1.insets = new Insets(0, 0, 5, 5);
		gbc_label1.gridx = 1;
		gbc_label1.gridy = 1;
		getContentPane().add(label1, gbc_label1);
		
		username = new JTextField();
		username.setFont(new Font("Candara", Font.PLAIN, 22));
		GridBagConstraints gbc_username = new GridBagConstraints();
		gbc_username.fill = GridBagConstraints.BOTH;
		gbc_username.insets = new Insets(0, 0, 5, 0);
		gbc_username.gridx = 2;
		gbc_username.gridy = 1;
		getContentPane().add(username, gbc_username);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setFont(new Font("Corbel Light", Font.PLAIN, 22));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.anchor = GridBagConstraints.SOUTH;
		gbc_lblPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 1;
		gbc_lblPassword.gridy = 2;
		getContentPane().add(lblPassword, gbc_lblPassword);
		password = new JPasswordField();
		password.setFont(new Font("Corbel", Font.PLAIN, 25));
		GridBagConstraints gbc_password = new GridBagConstraints();
		gbc_password.fill = GridBagConstraints.BOTH;
		gbc_password.insets = new Insets(0, 0, 5, 0);
		gbc_password.gridx = 2;
		gbc_password.gridy = 2;
		getContentPane().add(password, gbc_password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Corbel", Font.PLAIN, 24));
		login = btnLogin;
		login.addActionListener(controller);
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.anchor = GridBagConstraints.WEST;
		gbc_btnLogin.gridwidth = 2;
		gbc_btnLogin.gridx = 2;
		gbc_btnLogin.gridy = 3;
		getContentPane().add(btnLogin, gbc_btnLogin);
	}
}
