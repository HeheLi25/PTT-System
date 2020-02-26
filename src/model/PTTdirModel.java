package model;

import java.util.ArrayList;

public class PTTdirModel {
	private ArrayList<Requirement> reqList = FileTool.readAllReq();

	public ArrayList<Requirement> getReqList() {
		return reqList;
	}
	public void writeIn() {
		
		FileTool.overWriteReq(reqList);
		
	}
	public void setReqList(ArrayList<Requirement> reqList) {
		this.reqList = reqList;
	}
}
