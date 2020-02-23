package model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/** This class is a tool for reading and writing file. **/
public class FileTool {
	
	/**This method reads the Requirement.txt file
	 * and return an array of Requirements.
	 * @return A list of all Requirements.
	 */
	public static ArrayList<Requirement> readAllReq() {
		ArrayList<String> requirements = readFile("Requirements.txt");
		ArrayList<Requirement> reqList = new ArrayList<Requirement>();
		for(String s : requirements) {
			String[] str = s.split("\\*\\*\\*"); //split the line by "***".
			Requirement req = new Requirement(str[0],str[1],Double.parseDouble(str[2]),
					str[3],Boolean.parseBoolean(str[4]),Boolean.parseBoolean(str[5]));
			reqList.add(req);
		}
		return reqList;
	}
	
	/**This method takes one Requirement object 
	 * and write it into the file Requirements.txt
	 * @param r: one requirement object to write into file.
	 */
	public static void writeOneReq(Requirement r) {
		writeUpdate("Requirements.txt",r.toString()+"\n");
	}
	
	/**
	 * This method cleans up the Requirements.txt
	 */
	public void cleanReq() {
		try {
			FileWriter fileWriter = new FileWriter("Requirements.txt");
			fileWriter.write("");
			fileWriter.flush();
			fileWriter.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**This method takes an arrayList of Requirement objects
	 * and overwrite the Requirements.txt file with them.
	 * @param al: A list of requirements to overwrite the file.
	 */
	public static void overWriteReq(ArrayList<Requirement> al) {
		FileWriter fw = null;
		File file = new File("Requirements.txt");
		 try {
			fw = new FileWriter(file,false);
			for(Requirement r: al) {
				fw.write(r.toString()+"\n");
			}
			fw.flush();
		} catch (IOException e) {
			System.err.println("!!!Unable to overwrite Requirements.txt");
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**This method takes one Arrangement object 
	 * and write it into the file Requirements.txt
	 * @param r: one requirement object to write into file.
	 */
	public static void writeOneArr(Arrangement a) {
		writeUpdate("Arrangements.txt",a.toString()+"\n\n");
	}
	
	/**
	 * This method reads all arrangements from Arrangements.txt
	 * then creates Arrangement objects and put them in an ArrayList
	 * @return an ArrayList contains all Arrangement objects. 
	 */
	public static ArrayList<Arrangement> readAllArr(){
		List<String> raw = readFile("Arrangements.txt");
		ArrayList<Arrangement> result = new ArrayList<Arrangement>();
		Iterator it = raw.iterator();
		while(it.hasNext()) {
			//Create a requirement according to the data
			String reqLine = (String) it.next();
			String[] str = reqLine.split("\\*\\*\\*"); //split the line by "***".
			Requirement req = new Requirement(str[0],str[1],Double.parseDouble(str[2]),
					str[3],Boolean.parseBoolean(str[4]),Boolean.parseBoolean(str[5])); 
			//Create an arrangement object
			Arrangement a = new Arrangement(req); 
			//Read the staffs and add them to the arrangement object
			String staffsLine = (String) it.next();
			String[] stf = staffsLine.split("\\*\\*\\*"); 
			for(String s: stf) {
				if(!s.equals(""))a.addStaff(s);
			}
			//Read the training courses and add them to the arrangement object
			String trainingLine = (String) it.next();
			String[] t = trainingLine.split("\\*\\*\\*");
			for(String s: t) {
				if(!s.equals(""))a.addTraining(s);
			}
			//Add the arrangement obejct to the result ArrayList
			result.add(a);
			try{
				it.next();	//flush the empty line.
			}catch(Exception e) {
				//System.out.println("End reading");
			}
			
		}
		return result;
	}
	
		
	/**
	 * This method reads the content of a file.
	 * @param fileName: The path of the file.
	 * @return ArrayList<String>: Each String contains a line of the file content. 
	 **/
	public static ArrayList<String> readFile(String fileName) {
		File file = new File(fileName);
		if(!file.exists()) {
			System.err.println("!!!Error: Cannot find the file "+fileName);
			return null;
		}
		FileReader fr = null;
		ArrayList<String> result = new ArrayList<String>();
		try {
			fr = new FileReader(fileName);
			Scanner s = new Scanner(fr);
			while(s.hasNext()) {
				result.add(s.nextLine());
			}
		}catch(IOException e) {
			System.err.println("!!!Unable to read file "+fileName);
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * This method update the file by adding a line in the end of its content. 
	 * @param fileName: The path of the file.
	 * @param stuff: The String to be add into the file.
	 **/
	public static void writeUpdate(String fileName, String stuff) {
		FileWriter fw = null;
		File file = new File(fileName);
		 try {
			fw = new FileWriter(file,true);
			fw.write(stuff);
		} catch (IOException e) {
			System.err.println("!!!Unable to update file "+ fileName);
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * This method overwrite everything inside the file.
	 * @param fileName: The path of the file.
	 * @param stuff: The String to be add into the file.
	 **/	
	public static void writeOver(String fileName, String stuff) {
		FileWriter fw = null;
		File file = new File(fileName);
		 try {
			fw = new FileWriter(file,false);
			fw.write(stuff);
		} catch (IOException e) {
			System.err.println("!!!Unable to update file "+ fileName);
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
