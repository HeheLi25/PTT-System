package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.PTTdirFrame;
import model.PTTdirModel;

public class PTTdirController {
	private PTTdirFrame viewObject;
	private PTTdirModel modelObject;
	
	public PTTdirController(PTTdirModel model) {
		modelObject = model;
	}

	public void setView(PTTdirFrame view) {
		viewObject = view;
	}


	
}
