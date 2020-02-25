package model;

import java.util.ArrayList;

public class AccountCheck {
	public static boolean checkAccount(String username, String password, String position) {
		ArrayList<String> users = FileTool.readFile("Accounts.txt");
		String userInput = username+"***"+password+"***"+position;
		for(String s:users) {
			if(s.equals(userInput)) return true;
		}
		return false;
	}

}
