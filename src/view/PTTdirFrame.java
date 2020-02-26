package view;

import javax.swing.JFrame;




import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import controller.PTTdirController;
import model.FileTool;
import model.PTTdirModel;
import model.Requirement;

import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;


public class PTTdirFrame {

	private JFrame frame;
	private PTTdirController controllerObject;
	private PTTdirModel modelObject;
	private JButton btnSave;
	private JButton btnHome;
	private JPanel reqPanel;
	JScrollPane scrollPanel;

	public JPanel getReqPanel() {
		return reqPanel;
	}
	
	
//	/**
//	 * Launch the application.
//	 */
//	//Use model data and controller control to create GUI.
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PTTdirModel model = new PTTdirModel();
//					PTTdirController controller = new PTTdirController(model);
//					PTTdirFrame window = new PTTdirFrame(model);
//					controller.setView(window);
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
	
	

	/**
	 * Create the application.
	 */
	public PTTdirFrame(PTTdirModel model) {
		
        controllerObject = new PTTdirController(model);
        controllerObject.setView(this);
        modelObject = model;
        
        setFrame(new JFrame());
        getFrame().setTitle("PTTdir GUI");
		getFrame().setBounds(100, 100, 800, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		initialize();
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		btnSave = new JButton("Approve");
		btnSave.addActionListener(controllerObject);
		btnSave.setBounds(550, 424, 150, 29);
		frame.getContentPane().add(btnSave);
	
		
				
		JLabel lblNewLabel = new JLabel("Approve Requipments ");
		lblNewLabel.setFont(new Font("Corbel", Font.BOLD, 25));
		lblNewLabel.setBounds(21, 10, 285, 47);
		frame.getContentPane().add(lblNewLabel);
		
		scrollPanel = new JScrollPane();
		scrollPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPanel.setBounds(52, 89, 690, 310);
		frame.getContentPane().add(scrollPanel);
		
		JPanel panel = new JPanel();
		scrollPanel.setViewportView(panel);
		panel.setLayout(new GridLayout(0,5));
		
		

		reqPanel = panel;
		
		controllerObject.setReq();
		btnHome = new JButton("Logout");
		btnHome.setBounds(362, 424, 150, 29);
		btnHome.addActionListener(controllerObject);
		frame.getContentPane().add(btnHome);
		
		JLabel lblNewLabel_1 = new JLabel("Course");
		lblNewLabel_1.setForeground(new Color(0, 102, 102));
		lblNewLabel_1.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lblNewLabel_1.setBounds(58, 58, 83, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Class Director");
		lblNewLabel_1_1.setForeground(new Color(51, 102, 153));
		lblNewLabel_1_1.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(151, 58, 141, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("budget");
		lblNewLabel_1_1_1.setForeground(new Color(102, 102, 153));
		lblNewLabel_1_1_1.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lblNewLabel_1_1_1.setBounds(329, 58, 74, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Requirement");
		lblNewLabel_1_1_1_1.setForeground(new Color(153, 102, 153));
		lblNewLabel_1_1_1_1.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lblNewLabel_1_1_1_1.setBounds(438, 58, 141, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Approved");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(204, 102, 102));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lblNewLabel_1_1_1_1_1.setBounds(609, 58, 105, 29);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		
	



		}
	public void reinitialize(){
		reqPanel.removeAll();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,5));
		scrollPanel.setViewportView(panel);
		reqPanel = panel;
		controllerObject.setReq();
	}
	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
	public JButton getBtnHome() {
		return btnHome;
	}

	public void setBtnhome(JButton btnHome) {
		this.btnHome = btnHome;
	}
}
