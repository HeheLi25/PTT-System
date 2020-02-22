package View;

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

import Controller.PTTdirController;
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

	/**
	 * Launch the application.
	 */
	//Use model data and controller control to create GUI.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTTdirModel model = new PTTdirModel();
					PTTdirController controller = new PTTdirController(model);
					PTTdirFrame window = new PTTdirFrame(model, controller);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PTTdirFrame(PTTdirModel model,PTTdirController controller) {
        controllerObject = controller;
        modelObject = model;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 800, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSave = new JButton("Update and return");
		btnSave.setBounds(550, 424, 200, 29);
		frame.getContentPane().add(btnSave);
	
		
				
		JLabel lblNewLabel = new JLabel("Approve Requipments ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		lblNewLabel.setBounds(48, 24, 285, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(52, 89, 690, 310);
		frame.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(modelObject.getReqList().size()+1, 1, 0, 0));
		
		//JLabel lblNewLabel_2 = new JLabel("Approved   courseName   classDir   budget   requirement   approved   arranged");
		//lblNewLabel_2.setBounds(48, 65, 649, 16);
		//frame.getContentPane().add(lblNewLabel_2);
		
		JLabel firstLabel = new JLabel("Approved   courseName   classDir   budget   requirement   approved   arranged");
		panel.add(firstLabel);
		
		
	
	
		for(int i =0;i<modelObject.getReqList().size();i++) {
		
			
			modelObject.getReqList().get(i).setCheckPanel(new JPanel());
			panel.add(modelObject.getReqList().get(i).getCheckPanel());
			modelObject.getReqList().get(i).getCheckPanel().setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
			
			JLabel infoLabel = new JLabel();
			
			modelObject.getReqList().get(i).setCheckBox(new JCheckBox());
			modelObject.getReqList().get(i).getCheckBox().addActionListener(controllerObject);
			modelObject.getReqList().get(i).getCheckPanel().add(modelObject.getReqList().get(i).getCheckBox());
			
			infoLabel.setText(modelObject.getReqList().get(i).printInfo());
			infoLabel.setHorizontalAlignment(SwingConstants.LEFT);
			modelObject.getReqList().get(i).getCheckPanel().add(infoLabel);
		}

		}

	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}