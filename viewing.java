package com.finalproject;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class viewing {
	public static void main(String[] args) {
		
	
		File files = new File("C:\\Users\\hkammari\\Downloads\\Directory");
		File filenames[] = files.listFiles(); {
		
		for (File filename : filenames)
		{
			
			System.out.println(filename);
			System.out.println("File Name : " + filename.getName());
		}

	}
	}
}