package model;

import java.util.ArrayList;
/**
 * This class is for the arranged requirements.
 * It contains the requirement, the staffs arranged to it and the training courses.
 */

public class Arrangement {
	
	public void setStaffs(ArrayList<String> staffs) {
		this.staffs = staffs;
	}
	public void setTraining(ArrayList<String> training) {
		this.training = training;
	}
	private Requirement requirement;
	private ArrayList<String> staffs;
	private ArrayList<String> training;
	
	public Arrangement(Requirement req) {
		requirement = req;
		staffs = new ArrayList<String>();
		training = new ArrayList<String>();
	}
	
	/**
	 * Add one staff to the staffs ArrayList
	 * @param staff: the arranged staff
	 */
	public void addStaff(String staff) {
		staffs.add(staff);
	}
	/**
	 * Add one training course to the training ArrayList
	 * @param training: the arranged training course
	 */
	public void addTraining(String training) {
		this.training.add(training);
	}
	/**
	 * This toString is used to organize the data properly into String
	 * so it can be stored into file. 
	 */
	public String toString() {
		String result = requirement.toString()+"\n";
		for(String s : staffs) {
			result = result + s+"***";
		}
		result = result + "\n";
		for(String s: training) {
			result = result + s +"***";
		}
		return result;
	}

}
