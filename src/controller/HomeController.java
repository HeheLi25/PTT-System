package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.HomeFrame;
import view.LoginFrame;

public class HomeController implements ActionListener {
	private HomeFrame view;
	
	public HomeController(HomeFrame view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getAdminButton()) {
			LoginFrame lf = new LoginFrame(view,"administrator");
			lf.setVisible(true);
		}	
		if(e.getSource() == view.getClassDirButton()) {
			LoginFrame lf = new LoginFrame(view,"class director");
			lf.setVisible(true);
		}	
		if(e.getSource() == view.getPTTDirButton()) {
			LoginFrame lf = new LoginFrame(view,"PTT director");
			lf.setVisible(true);
		}	
	}

}
