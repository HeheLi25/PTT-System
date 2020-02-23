package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
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
	public HomeFrame() {
		setTitle("HomePage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel homeTitleLabel = new JLabel("Choose your position");
		homeTitleLabel.setForeground(new Color(102, 153, 204));
		homeTitleLabel.setFont(new Font("Showcard Gothic", Font.BOLD | Font.ITALIC, 37));
		homeTitleLabel.setBounds(128, 21, 500, 77);
		contentPane.add(homeTitleLabel);
		
		JButton CDButton = new JButton("Class Director");
		CDButton.setForeground(new Color(128, 0, 128));
		CDButton.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 27));
		CDButton.setBounds(231, 109, 291, 58);
		contentPane.add(CDButton);
		
		JButton PTTDButton = new JButton("PTT Director");
		PTTDButton.setForeground(new Color(128, 0, 128));
		PTTDButton.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 27));
		PTTDButton.setBounds(231, 199, 291, 58);
		contentPane.add(PTTDButton);
		
		JButton AdminaButton = new JButton("Administrator");
		AdminaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		AdminaButton.setForeground(new Color(128, 0, 128));
		AdminaButton.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 27));
		AdminaButton.setBounds(231, 293, 291, 58);
		contentPane.add(AdminaButton);
	}

}
