package com.finalproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
 public class drctry {
public String path;

      

      public void setPath(String path) {
    	  this.path = path;
      File file = new File("C:\\Users\\hkammari\\Downloads\\Directory\\locked" + path);
      boolean bool = file.mkdir();
      if(bool){
    	  System.out.println("Registration sucessful");
         System.out.println("Directory created successfully");
         System.out.println(file.getAbsolutePath());
         System.out.println(file.getName());
         
      }else{
         System.out.println("Sorry couldn’t create specified directory");  
      }  
      }
 	}