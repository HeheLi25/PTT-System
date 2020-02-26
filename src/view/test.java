package view;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class test extends JFrame {
	private JButton button1, button2;
	private JLabel UIlabel;
	private JPanel panel1, panel2;
	private JTextField textField;
	
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setLocation(50,50);
		setTitle("Class Director");
		button1 = new JButton("View Requirements");
		//button1.addActionListener(controllerObject);
		button2 = new JButton("Write Requirements");
		//button2.addActionListener(controllerObject);
		UIlabel = new JLabel("Class Director UI");
		this.setLayout(new BorderLayout());
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.add(UIlabel);
		this.add(panel1, BorderLayout.NORTH);
		panel2.add(button1);
		panel2.add(button2);
		this.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridBagLayout());
		
	}
	
	public static void main(String[] args) {
		test test1 = new test();
		test1.setVisible(true);
	}


}
