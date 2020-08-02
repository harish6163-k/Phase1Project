package com.finalproject;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class srchng {
	

	public static void main(String[] args) throws IOException {
		
		 String fileName = "";
         try {
             //    System.out.print("Please Enter the path-\t");
              //   BufferedReader filePathReader = new BufferedReader(
                //                 new InputStreamReader(System.in));
                 //path = filePathReader.readLine();
                 System.out.print("Please Enter file Name-\t");
                 BufferedReader fileNameReader = new BufferedReader(
                                 new InputStreamReader(System.in));
                 fileName = fileNameReader.readLine();

                 File directory = new File("C:\\Users\\hkammari\\Downloads\\Directory");
                 File[] listOfFiles = directory.listFiles();
                 for (File file : listOfFiles) {
                         String name = file.getName();
                         if (name.equals(fileName)) {
                                 System.out.println("File Found");
                             
                                 return;
                         }
                 }
                 System.out.println(fileName + " not found in " +  " directory");

         } catch (IOException e) {
                 e.printStackTrace();
         }

	}
	
}