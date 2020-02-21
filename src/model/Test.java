package model;

import java.awt.EventQueue;
import java.util.ArrayList;

import View.PTTdirView;

public class Test {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTTdirView window = new PTTdirView();
					window.getFrame().setVisible(true);
					//ArrayList<Requirement> reqList = FileTool.readAllReq();
				
	
				//	PPTdirController controller = 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		
//		Requirement newReq = new Requirement("Course1","Name1",1000.0,"This is Requirement 1",true,false);
//		FileTool.writeOneReq(newReq);
//		ArrayList<Requirement> al = new ArrayList<Requirement>();
//		for(int i = 0; i<8;i++) {
//			al.add(new Requirement("Course"+i, "Name"+i, 100*i,"This is Requirement "+i, true, false));
//		}
//		FileTool.overWriteReq(al);
//		
//		ArrayList<Requirement> reqList = FileTool.readAllReq();
//		for(Requirement r :reqList) {
//			System.out.println(r.toString());
//		}
//	}

	}
