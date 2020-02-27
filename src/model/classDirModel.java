package model;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.swing.JTextField;

public class classDirModel {
	private ArrayList<Requirement> reqList;
	private Requirement req;
	
	public ArrayList<Requirement> getReqList() {
		return reqList;
	}
	
//	public void save(String fileName, ArrayList<JTextField> textField) throws Exception{
//		FileOutputStream out = new FileOutputStream(fileName, true);
//		for(int i = 0; i < textField.size(); i++) {
//		out.write(textField.get(i).getText().getBytes());
//		}
//		//FileTool.writeOneReq(req);
//	}
	
	public void setReqList() {
		reqList = FileTool.readAllReq();
	}
	
	

}
