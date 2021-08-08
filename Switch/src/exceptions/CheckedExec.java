package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExec {

	public CheckedExec() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//code that might generate exception
		try {
			Scanner sc=new Scanner(new File("D:\\practice\\Switch\\files\\SAPIENS.postman_collectio.json"));
			//code that follows will not execute in case exception occurs
		} 
		//error handling is separated from the logic
		catch (FileNotFoundException e) {
			System.out.println("file not found here");
			e.printStackTrace();
			//System.exit(1);
		}
		//code that always executes
		
		finally {
			System.out.println("code to print with or without exception");
		}
		System.out.println("line will print for rest of the code");

	}

}
