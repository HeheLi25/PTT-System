package model;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		FileTool ft = new FileTool();
		ArrayList<Requirement> reqList = FileTool.readAllReq();
		for(Requirement r :reqList) {
			System.out.println(r.toString());
		}
		Requirement newReq = new Requirement("Adv.Programming","Mathew",1000.0,"Nothing",true,false);
		ft.writeUpdate("Requirements.txt", newReq.toString());
	}

}
