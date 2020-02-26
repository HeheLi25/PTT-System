package view;

import javax.swing.JFrame;




import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.util.ArrayList;




import controller.PTTdirController;
import model.FileTool;

import model.Requirement;

import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;


public class PTTdirFrame extends JFrame {

	private PTTdirController controller;
	private JButton btnSave;
	private JButton btnHome;
	
	private JPanel contentPanel;
	private ArrayList<Requirement> allReq;
	/**
	 * Launch the application.
	 */
	//Use model data and controller control to create GUI.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTTdirFrame frame = new PTTdirFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public PTTdirFrame() {
		controller = new PTTdirController(this);
		
		
        setTitle("PTTdir GUI");
		setBounds(100, 100, 800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
	
		
		
		JButton btnSave= new JButton("Save");
		btnSave.setBounds(550, 424, 150, 29);
		this.btnSave=btnSave;
		btnSave.addActionListener(controller);
		contentPanel.add(btnSave);
		

		JButton btnHome = new JButton("Home");
		btnHome.setBounds(362, 424, 150, 29);
		this.btnHome=btnHome;
		btnHome.addActionListener(controller);
		contentPanel.add(btnHome);
		
		JLabel topLabel = new JLabel("Approve Requipments ");
		topLabel.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		topLabel.setBounds(48, 24, 285, 29);
		contentPanel.add(topLabel);
		
		
	
		
		controller.setRequirement();
		}
	
	public void upDate(){
		this.setVisible(false);
		FileTool.overWriteReq(this.getAllReq());
		
		contentPanel.removeAll();
		PTTdirFrame frame2 = new PTTdirFrame();
		frame2.setVisible(true);
	}
	
	public JPanel getContentPanel() {
		return contentPanel;
	}
	public ArrayList<Requirement> getAllReq() {
		return allReq;
	}
	public JButton getBtnSave() {
		return btnSave;
	}
	public void setAllReq(ArrayList<Requirement> allReq) {
		this.allReq = allReq;
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
