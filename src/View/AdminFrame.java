package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class AdminFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrame frame = new AdminFrame();
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
	public AdminFrame() {
		setTitle("Administrator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel requireTitle = new JLabel("Requirement List");
		requireTitle.setBackground(new Color(224, 255, 255));
		requireTitle.setForeground(new Color(30, 144, 255));
		requireTitle.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		requireTitle.setBounds(57, 22, 267, 39);
		contentPane.add(requireTitle);
		
		JLabel arrangeLabel = new JLabel("Click to arrange");
		arrangeLabel.setForeground(new Color(50, 205, 50));
		arrangeLabel.setBackground(new Color(255, 0, 0));
		arrangeLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 22));
		arrangeLabel.setBounds(479, 25, 242, 36);
		contentPane.add(arrangeLabel);
		
		JButton seePreButton = new JButton("See Previous Page");
		seePreButton.setBackground(new Color(245, 245, 245));
		seePreButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 25));
		seePreButton.setForeground(new Color(255, 140, 0));
		seePreButton.setBounds(40, 355, 302, 71);
		contentPane.add(seePreButton);
		
		JButton backButton = new JButton("Back");
		backButton.setBackground(new Color(245, 245, 245));
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 25));
		backButton.setBounds(574, 362, 159, 57);
		contentPane.add(backButton);
		
		JPanel adminPanel1 = new JPanel();
		adminPanel1.setBounds(49, 57, 576, 51);
		contentPane.add(adminPanel1);
		adminPanel1.setLayout(null);
		
		JLabel requireLabel1 = new JLabel("Requirement 1 will appear there");
		requireLabel1.setBounds(10, 6, 385, 39);
		adminPanel1.add(requireLabel1);
		requireLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton requireButton1 = new JButton("Arrange");
		requireButton1.setBounds(431, 11, 107, 31);
		adminPanel1.add(requireButton1);
		requireButton1.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		JPanel adminPanel2 = new JPanel();
		adminPanel2.setLayout(null);
		adminPanel2.setBounds(49, 108, 576, 51);
		contentPane.add(adminPanel2);
		
		JLabel requireLabel2 = new JLabel("Requirement 2 will appear there");
		requireLabel2.setBounds(10, 6, 385, 39);
		adminPanel2.add(requireLabel2);
		requireLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton requireButton2 = new JButton("Arrange");
		requireButton2.setBounds(432, 11, 107, 31);
		adminPanel2.add(requireButton2);
		requireButton2.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		JPanel adminPanel3 = new JPanel();
		adminPanel3.setLayout(null);
		adminPanel3.setBounds(49, 158, 576, 51);
		contentPane.add(adminPanel3);
		
		JLabel requireLabel3 = new JLabel("Requirement 3 will appear there");
		requireLabel3.setBounds(10, 16, 385, 22);
		adminPanel3.add(requireLabel3);
		requireLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton requireButton3 = new JButton("Arrange");
		requireButton3.setBounds(433, 16, 107, 31);
		adminPanel3.add(requireButton3);
		requireButton3.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		JPanel adminPanel4 = new JPanel();
		adminPanel4.setLayout(null);
		adminPanel4.setBounds(49, 209, 576, 51);
		contentPane.add(adminPanel4);
		
		JLabel requireLabel4 = new JLabel("Requirement 4 will appear there");
		requireLabel4.setBounds(10, 11, 385, 31);
		adminPanel4.add(requireLabel4);
		requireLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton requireButton4 = new JButton("Arrange");
		requireButton4.setBounds(433, 12, 107, 31);
		adminPanel4.add(requireButton4);
		requireButton4.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		JPanel adminPanel5 = new JPanel();
		adminPanel5.setLayout(null);
		adminPanel5.setBounds(49, 260, 576, 51);
		contentPane.add(adminPanel5);
		
		JLabel requireLabel5 = new JLabel("Requirement 5 will appear there");
		requireLabel5.setBounds(10, 11, 385, 31);
		adminPanel5.add(requireLabel5);
		requireLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton requireButton5 = new JButton("Arrange");
		requireButton5.setBounds(432, 12, 107, 31);
		adminPanel5.add(requireButton5);
		requireButton5.setFont(new Font("Dialog", Font.PLAIN, 17));
	}
}
