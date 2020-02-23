package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;

import model.Requirement;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArrangedRFrame extends JFrame {

	private JPanel contentPane;
	Requirement r;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrangedRFrame frame = new ArrangedRFrame(new Requirement("","",0.0," "));
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
	public ArrangedRFrame(Requirement r) {
		this.r = r;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel arrangedPanel1 = new JPanel();
		arrangedPanel1.setBorder(new LineBorder(new Color(0, 0, 128)));
		arrangedPanel1.setBounds(10, 11, 412, 93);
		contentPane.add(arrangedPanel1);
		arrangedPanel1.setLayout(null);
		
		JLabel require1 = new JLabel("Requiremen 1");
		require1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		require1.setBounds(25, 11, 352, 21);
		arrangedPanel1.add(require1);
		
		JLabel staffLabel1 = new JLabel("Staff: add staff here");
		staffLabel1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel1.setBounds(25, 39, 231, 21);
		arrangedPanel1.add(staffLabel1);
		
		JLabel courseLabel1 = new JLabel("Training Courses:");
		courseLabel1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel1.setBounds(24, 66, 308, 21);
		arrangedPanel1.add(courseLabel1);
		
		JPanel arrangedPanel3 = new JPanel();
		arrangedPanel3.setBorder(new LineBorder(new Color(25, 25, 112)));
		arrangedPanel3.setLayout(null);
		arrangedPanel3.setBounds(10, 219, 412, 93);
		contentPane.add(arrangedPanel3);
		
		JLabel require3 = new JLabel("Requiremen 1");
		require3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		require3.setBounds(25, 11, 352, 21);
		arrangedPanel3.add(require3);
		
		JLabel staffLabel3 = new JLabel("Staff: add staff here");
		staffLabel3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel3.setBounds(25, 32, 231, 29);
		arrangedPanel3.add(staffLabel3);
		
		JLabel courseLabel3 = new JLabel("Training Courses:");
		courseLabel3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel3.setBounds(25, 61, 308, 21);
		arrangedPanel3.add(courseLabel3);
		
		JPanel arrangedPanel2 = new JPanel();
		arrangedPanel2.setBorder(new LineBorder(new Color(25, 25, 112)));
		arrangedPanel2.setLayout(null);
		arrangedPanel2.setBounds(10, 115, 412, 93);
		contentPane.add(arrangedPanel2);
		
		JLabel require2 = new JLabel("Requiremen 1");
		require2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		require2.setBounds(25, 11, 352, 21);
		arrangedPanel2.add(require2);
		
		JLabel staffLabel2 = new JLabel("Staff: add staff here");
		staffLabel2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel2.setBounds(25, 32, 231, 29);
		arrangedPanel2.add(staffLabel2);
		
		JLabel courseLabel2 = new JLabel("Training Courses:");
		courseLabel2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel2.setBounds(25, 61, 308, 21);
		arrangedPanel2.add(courseLabel2);
		
		JPanel arrangedPanel4 = new JPanel();
		arrangedPanel4.setBorder(new LineBorder(new Color(25, 25, 112)));
		arrangedPanel4.setLayout(null);
		arrangedPanel4.setBounds(10, 323, 412, 93);
		contentPane.add(arrangedPanel4);
		
		JLabel require4 = new JLabel("Requiremen 1");
		require4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		require4.setBounds(25, 11, 352, 21);
		arrangedPanel4.add(require4);
		
		JLabel staffLabel4 = new JLabel("Staff: add staff here");
		staffLabel4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		staffLabel4.setBounds(25, 32, 231, 29);
		arrangedPanel4.add(staffLabel4);
		
		JLabel courseLabel4 = new JLabel("Training Courses:");
		courseLabel4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		courseLabel4.setBounds(25, 61, 308, 21);
		arrangedPanel4.add(courseLabel4);
		
		JButton backButton = new JButton("BACK");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButton.setBackground(new Color(192, 192, 192));
		backButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 26));
		backButton.setBounds(574, 340, 147, 59);
		contentPane.add(backButton);
	}

}
