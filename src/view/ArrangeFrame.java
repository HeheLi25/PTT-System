package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArrangeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrangeFrame frame = new ArrangeFrame();
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
	public ArrangeFrame() {
		setTitle("Arrangement Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel requireLabel = new JLabel("Requirement   XXX");
		requireLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 27));
		requireLabel.setForeground(new Color(128, 0, 128));
		requireLabel.setBounds(232, 11, 346, 52);
		contentPane.add(requireLabel);
		
		JLabel staffTitleLabel = new JLabel("Staff");
		staffTitleLabel.setForeground(new Color(34, 139, 34));
		staffTitleLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		staffTitleLabel.setBounds(75, 87, 101, 35);
		contentPane.add(staffTitleLabel);
		
		JLabel courseTitleLabel = new JLabel("Training Course");
		courseTitleLabel.setForeground(new Color(34, 139, 34));
		courseTitleLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		courseTitleLabel.setBounds(329, 87, 225, 35);
		contentPane.add(courseTitleLabel);
		
		JPanel staffPanel1 = new JPanel();
		staffPanel1.setBounds(47, 129, 265, 52);
		contentPane.add(staffPanel1);
		staffPanel1.setLayout(null);
		
		JLabel staffLabel1 = new JLabel("Staff 1");
		staffLabel1.setBounds(21, 11, 48, 21);
		staffPanel1.add(staffLabel1);
		staffLabel1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JCheckBox staffCheck1 = new JCheckBox("Choose");
		staffCheck1.setBounds(135, 6, 124, 32);
		staffPanel1.add(staffCheck1);
		staffCheck1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel staffPanel2 = new JPanel();
		staffPanel2.setLayout(null);
		staffPanel2.setBounds(47, 180, 265, 52);
		contentPane.add(staffPanel2);
		
		JLabel staffLabel2 = new JLabel("Staff 1");
		staffLabel2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel2.setBounds(21, 11, 48, 21);
		staffPanel2.add(staffLabel2);
		
		JCheckBox staffCheck2 = new JCheckBox("Choose");
		staffCheck2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		staffCheck2.setBounds(135, 6, 124, 32);
		staffPanel2.add(staffCheck2);
		
		JPanel staffPanel3 = new JPanel();
		staffPanel3.setLayout(null);
		staffPanel3.setBounds(47, 231, 265, 52);
		contentPane.add(staffPanel3);
		
		JLabel staffLabel3 = new JLabel("Staff 1");
		staffLabel3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel3.setBounds(21, 11, 48, 21);
		staffPanel3.add(staffLabel3);
		
		JCheckBox staffCheck3 = new JCheckBox("Choose");
		staffCheck3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		staffCheck3.setBounds(135, 6, 124, 32);
		staffPanel3.add(staffCheck3);
		
		JPanel staffPanel4 = new JPanel();
		staffPanel4.setLayout(null);
		staffPanel4.setBounds(47, 282, 265, 52);
		contentPane.add(staffPanel4);
		
		JLabel staffLabel4 = new JLabel("Staff 1");
		staffLabel4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel4.setBounds(21, 11, 48, 21);
		staffPanel4.add(staffLabel4);
		
		JCheckBox staffCheck4 = new JCheckBox("Choose");
		staffCheck4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		staffCheck4.setBounds(135, 6, 124, 32);
		staffPanel4.add(staffCheck4);
		
		JPanel staffPanel5 = new JPanel();
		staffPanel5.setLayout(null);
		staffPanel5.setBounds(47, 334, 265, 52);
		contentPane.add(staffPanel5);
		
		JLabel staffLabel5 = new JLabel("Staff 1");
		staffLabel5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel5.setBounds(21, 11, 48, 21);
		staffPanel5.add(staffLabel5);
		
		JCheckBox staffCheck5 = new JCheckBox("Choose");
		staffCheck5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		staffCheck5.setBounds(135, 6, 124, 32);
		staffPanel5.add(staffCheck5);
		
		JPanel staffPanel6 = new JPanel();
		staffPanel6.setLayout(null);
		staffPanel6.setBounds(47, 384, 265, 52);
		contentPane.add(staffPanel6);
		
		JLabel staffLabel6 = new JLabel("Staff 1");
		staffLabel6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel6.setBounds(21, 11, 48, 21);
		staffPanel6.add(staffLabel6);
		
		JCheckBox staffCheck6 = new JCheckBox("Choose");
		staffCheck6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		staffCheck6.setBounds(135, 6, 124, 32);
		staffPanel6.add(staffCheck6);
		
		JPanel coursePanel1 = new JPanel();
		coursePanel1.setBounds(329, 129, 379, 48);
		contentPane.add(coursePanel1);
		coursePanel1.setLayout(null);
		
		JCheckBox courseCheck1 = new JCheckBox("Choose");
		courseCheck1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseCheck1.setBounds(249, 7, 124, 32);
		coursePanel1.add(courseCheck1);
		
		JLabel courseLabel1 = new JLabel("Course Name");
		courseLabel1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel1.setBounds(10, 3, 233, 39);
		coursePanel1.add(courseLabel1);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(329, 129, 225, 48);
		contentPane.add(label_4);
		
		JPanel coursePanel2 = new JPanel();
		coursePanel2.setLayout(null);
		coursePanel2.setBounds(329, 184, 379, 48);
		contentPane.add(coursePanel2);
		
		JCheckBox courseCheck2 = new JCheckBox("Choose");
		courseCheck2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseCheck2.setBounds(249, 7, 124, 32);
		coursePanel2.add(courseCheck2);
		
		JLabel courseLabel2 = new JLabel("Course Name");
		courseLabel2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel2.setBounds(10, 3, 233, 39);
		coursePanel2.add(courseLabel2);
		
		JPanel coursePanel3 = new JPanel();
		coursePanel3.setLayout(null);
		coursePanel3.setBounds(329, 235, 379, 48);
		contentPane.add(coursePanel3);
		
		JCheckBox courseCheck3 = new JCheckBox("Choose");
		courseCheck3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseCheck3.setBounds(249, 7, 124, 32);
		coursePanel3.add(courseCheck3);
		
		JLabel courseLabel3 = new JLabel("Course Name");
		courseLabel3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel3.setBounds(10, 3, 233, 39);
		coursePanel3.add(courseLabel3);
		
		JPanel coursePanel4 = new JPanel();
		coursePanel4.setLayout(null);
		coursePanel4.setBounds(329, 286, 379, 48);
		contentPane.add(coursePanel4);
		
		JCheckBox courseCheck4 = new JCheckBox("Choose");
		courseCheck4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseCheck4.setBounds(249, 7, 124, 32);
		coursePanel4.add(courseCheck4);
		
		JLabel courseLabel4 = new JLabel("Course Name");
		courseLabel4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel4.setBounds(10, 3, 233, 39);
		coursePanel4.add(courseLabel4);
		
		JPanel coursePanel5 = new JPanel();
		coursePanel5.setLayout(null);
		coursePanel5.setBounds(329, 338, 379, 48);
		contentPane.add(coursePanel5);
		
		JCheckBox courseCheck5 = new JCheckBox("Choose");
		courseCheck5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseCheck5.setBounds(249, 7, 124, 32);
		coursePanel5.add(courseCheck5);
		
		JLabel courseLabel5 = new JLabel("Course Name");
		courseLabel5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel5.setBounds(10, 3, 233, 39);
		coursePanel5.add(courseLabel5);
		
		JButton ArrangeBackButton = new JButton("Back");
		ArrangeBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		ArrangeBackButton.setBackground(new Color(128, 128, 128));
		ArrangeBackButton.setForeground(new Color(0, 0, 0));
		ArrangeBackButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 25));
		ArrangeBackButton.setBounds(10, 11, 114, 52);
		contentPane.add(ArrangeBackButton);
		
		JButton arrangeSubmitButton = new JButton("Submit");
		arrangeSubmitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		arrangeSubmitButton.setBackground(new Color(255, 165, 0));
		arrangeSubmitButton.setForeground(new Color(255, 0, 0));
		arrangeSubmitButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 25));
		arrangeSubmitButton.setBounds(569, 397, 139, 52);
		contentPane.add(arrangeSubmitButton);
	}
}
