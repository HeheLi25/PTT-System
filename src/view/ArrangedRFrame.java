package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.border.LineBorder;

import controller.ArrangedRController;
import model.Requirement;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArrangedRFrame extends JFrame {

	public JPanel contentPanel;
	public ArrangedRController controller;
	public JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrangedRFrame frame = new ArrangedRFrame();
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
	public ArrangedRFrame() {
		controller = new ArrangedRController(this);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		this.setTitle("Arranged Requirements");
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JButton backButton = new JButton("BACK");
		backButton.setBackground(new Color(192, 192, 192));
		backButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		backButton.setBounds(574, 340, 147, 59);
		this.back = backButton;
		back.addActionListener(controller);
		contentPanel.add(backButton);
		
		controller.setArrangement();
	}

}
