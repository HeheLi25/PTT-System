package model;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/** This class is a tool for reading and writing file. **/
public class FileTool {
		
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
