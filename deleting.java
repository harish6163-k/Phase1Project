package com.finalproject;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class deleting {

	
		public static void main(String[] args) {
		try { 
	         File file = new File("C:\\Users\\hkammari\\Downloads\\Directory");
	         File[] filelist=((File) file).listFiles();
	         System.out.println("Enter The FileName To be Deleted Followed By .txt");
	         Scanner scan=new Scanner(System.in);
	         String filename=scan.next();
	         String abs_path="";
	         for (File file2 : filelist) {
				if(file2.getName().equals(filename)) {
					abs_path=file2.getAbsolutePath();
					file2.delete();
				}}
	         if(abs_path.isEmpty()) {
	        	 System.out.println("file Not Found");
	        	 
	         }
	         else {
	        	 System.out.println("file is deleted");
	        
	         }
				
	         
		 }
	         catch(Exception ex) {
	        	 ex.printStackTrace();
	        
	         }
		 
	}

}
