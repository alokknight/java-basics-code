package filehandeling;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileHandeling {
	public void createfile(){
		try{
			File f = new File("NewTextFile.txt");
			if(f.createNewFile()){
				System.out.println("New file created"+f.getName());
			}else{
				System.out.println("file already exist");
			}
			
		}catch(IOException e){
			System.out.println(e);
			
		}
	}
	public void readfile(){
		
		try{
			File f = new File("NewTextFile.txt");
			
			///use Scanner obj to pass into Scanner constructor;
			Scanner scan = new Scanner(f);   
			while(scan.hasNextLine()){
				String data =scan.nextLine();
				System.out.println(data);
			}
			scan.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		
	}
	public void writefile(){
		try {
			FileWriter f = new FileWriter("NewTextFile.txt",true);
			f.write("written more in file.");
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}


public class FileHandleingDemoClass {
	public static void main(String[] args) {
		
		FileHandeling fileObj = new FileHandeling();
//		String operation = "create";
		String operation = "write";
		
		switch(operation){
		case "write":
		{
			fileObj.writefile();
		}
		case "read":
			{
				fileObj.readfile();
			}
			break;
		case "create":
			{
				fileObj.createfile();
			}
		
		}
		
	}
}
