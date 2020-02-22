package model;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Requirement {
	private String courseName;
	private String classDir;
	private double budget;
	private String requirement;
	private boolean approved;
	private boolean arranged;
	private JCheckBox checkBox ;
	private JPanel checkPanel; 
	//Constructor
	public Requirement(String courseName,String classDir,double budget,String requirement) {
		this.courseName = courseName;
		this.classDir = classDir;
		this.budget = budget;
		this.requirement = requirement;
		this.approved = false;
		this.arranged = false;
		
	}
	public Requirement(String courseName,String classDir,double budget,String requirement,boolean approved, boolean arranged) {
		this.courseName = courseName;
		this.classDir = classDir;
		this.budget = budget;
		this.requirement = requirement;
		this.approved = approved;
		this.arranged = arranged;
	}
	
	
	public String toString() {
		return courseName+"***"+classDir+"***"+budget+"***"+requirement+"***"+approved+"***"+arranged;
	}
	public String printInfo() {
		return "    "+courseName+"    "+classDir+"   "+budget+"   "+requirement+"   "+approved+"   "+arranged;
	}
	//Getters and Setters
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getClassDir() {
		return classDir;
	}
	public void setClassDir(String classDir) {
		this.classDir = classDir;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	public boolean isArranged() {
		return arranged;
	}
	public void setArranged(boolean arranged) {
		this.arranged = arranged;
	}
	public JCheckBox getCheckBox() {
		return checkBox;
	}
	public void setCheckBox(JCheckBox checkBox) {
		this.checkBox = checkBox;
	}
	public JPanel getCheckPanel() {
		return checkPanel;
	}
	public void setCheckPanel(JPanel checkPanel) {
		this.checkPanel = checkPanel;
	}
	

}
