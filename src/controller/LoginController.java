package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.AccountCheck;
import model.FileTool;
import view.AdminFrame;
import view.LoginFrame;

public class LoginController implements ActionListener{
	LoginFrame view;
	public LoginController(LoginFrame view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getLogin()) {
			String username = view.getUsername().getText();
			String password = view.getPassword().getText();
			String position = view.getPosition();
			boolean match = AccountCheck.checkAccount(username, password, position);
			if(match) {
				view.closeHomeFrame();
				view.dispose();
				AdminFrame af = new AdminFrame();
				af.setVisible(true);
			}else {
				view.reset();
				JOptionPane.showMessageDialog(null, "Wrong username or password.", "Alert", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	

}
