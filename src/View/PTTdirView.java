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
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.Scrollbar;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;



import javax.swing.SwingConstants;
import javax.swing.ScrollPaneConstants;


public class PTTdirView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public PTTdirView() {
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
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(646, 424, 117, 29);
		frame.getContentPane().add(btnSave);
		
		JLabel lblNewLabel = new JLabel("Approve Requipments ");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		lblNewLabel.setBounds(52, 24, 285, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		JTable tab = new JTable();
		tab.setSurrendersFocusOnKeystroke(true);
		tab.setCellSelectionEnabled(true);
		CustomModel mod = new CustomModel();
	    mod.addColumn("approved");
		mod.addColumn("courseName");
	    mod.addColumn("classDir");
	    mod.addColumn("budget");
	    mod.addColumn("requirements");
	
		scrollPane.setBounds(52, 77, 711, 324);
		frame.getContentPane().add(scrollPane);
		Object[] data = {false,"Course0","Name0","0.0","This is Requirement 22222222222222222222220"};
		Object[] data1 = {new Boolean(false),"Course0","Name0","0.0","This is Requirement 0"};
		Object[] data2 = {new Boolean(false),"Course0","Name0","0.0","This is Requirement 0"};
		Object[] data3 = {new Boolean(false),"Course0","Name0","0.0","This is Requirement 0"};
        mod.addRow(data);
        mod.addRow(data1);
        mod.addRow(data2);
        mod.addRow(data3);
        tab.setModel(mod);
        scrollPane.setViewportView(tab);
		
		

		
	

		}
	
	class CustomModel extends DefaultTableModel {
		 
        public boolean isCellEditable(int row, int column) {
            if (column > 0) {
                return false;
            } else {
                return true;
            }
        }
 
        public Class getColumnClass(int c) {
            return getValueAt(0, c).getClass();
        }
    }
 

	
	
	public JFrame getFrame() {
		
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
