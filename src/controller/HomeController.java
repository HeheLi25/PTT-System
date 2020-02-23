package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.HomeFrame;
import view.AdminFrame;

public class HomeController implements ActionListener {
	private HomeFrame view;
	
	public HomeController(HomeFrame view) {
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.adminButton) {
			view.dispose();
			AdminFrame af = new AdminFrame();
			af.setVisible(true);
		}	
	}

}
