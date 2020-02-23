package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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

		JPanel panel = new JPanel();
		panel.setBounds(48, 61, 643, 281);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		JScrollPane sp = new JScrollPane(panel);
		sp.setBounds(67, 61, 624, 279);
		contentPane.add(sp);

		// requireLabel 1
		JLabel requireLabel1 = new JLabel("Requirement 1 will appear there");
		requireLabel1.setBounds(10, 6, 385, 39);

		requireLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));

		panel.add(requireLabel1);
		// requireButton1
		JButton requireButton1 = new JButton("Arrange");
		requireButton1.setBounds(431, 11, 107, 31);

		requireButton1.setFont(new Font("Dialog", Font.PLAIN, 17));
		panel.add(requireButton1);

		// requirementLabel 2
		JLabel requireLabel2 = new JLabel("Requirement 2 will appear there");
		requireLabel2.setBounds(10, 6, 385, 39);
		requireLabel2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		panel.add(requireLabel2);

		// requireButton2
		JButton requireButton2 = new JButton("Arrange");
		requireButton2.setBounds(432, 11, 107, 31);
		requireButton2.setFont(new Font("Dialog", Font.PLAIN, 17));
		panel.add(requireButton2);


		JLabel requireLabel3 = new JLabel("Requirement 3 will appear there");
		requireLabel3.setBounds(10, 16, 385, 22);
		requireLabel3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		panel.add(requireLabel3);

		JButton requireButton3 = new JButton("Arrange");
		requireButton3.setBounds(433, 16, 107, 31);
		requireButton3.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		panel.add(requireButton3);
		



		JLabel requireLabel4 = new JLabel("Requirement 4 will appear there");
		requireLabel4.setBounds(10, 11, 385, 31);
		requireLabel4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(requireLabel4);
		
		JButton requireButton4 = new JButton("Arrange");
		requireButton4.setBounds(433, 12, 107, 31);
		requireButton4.setFont(new Font("Dialog", Font.PLAIN, 17));
		panel.add(requireButton4);

		JLabel requireLabel5 = new JLabel("Requirement 5 will appear there");
		requireLabel5.setBounds(10, 11, 385, 31);
		requireLabel5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(requireLabel5);

		JButton requireButton5 = new JButton("Arrange");
		requireButton5.setBounds(432, 12, 107, 31);
		requireButton5.setFont(new Font("Dialog", Font.PLAIN, 17));
		panel.add(requireButton5);

		JLabel label = new JLabel("");
		panel.add(label);
		panel.add(new JLabel("Requirement 5 will appear there "));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel("Requirement 5 will appear there "));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel("Requirement 5 will appear there "));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel(" Requirement 5 will appear there"));
		panel.add(new JLabel(" Requirement 5 will appear there"));
	}
}
