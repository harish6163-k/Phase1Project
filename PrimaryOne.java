package com.finalproject;

import java.io.File;
import java.util.Scanner;

public class PrimaryOne {
	public static void main(String[] args)
	{
		
		System.out.println("******WELCOME TO LOCKME.COM******");
		System.out.println("***********FILE MANAGEMENT SYSTEM******* ");
		System.out.println("********** Developed by K.Harish *********");
		Scanner scan=new Scanner(System.in);
		regstrt reg = new regstrt();
		login log=new login();
		//System.out.println(" 1.Registration \n  2.Login ");
		//int choice=scan.nextInt();
	
		try {	
		while(true)
		{
						System.out.println(" 1.Registration \n 2.Login ");
						int choice=scan.nextInt();
						
						
					switch(choice)
					{
					case 1:System.out.println("******WELCOME TO LOCKME.COM******");
						System.out.println("USER NAME:user name should have 5 letter in lower case and 3 numbers after the letter");
						System.out.println("PASSWORD:Password should be less than 5and more than 9 characters in length.should contain upper case,lower case,number,special character");
						  //regstrt reg=new regstrt();
						   System.out.print("user name  :");
						   reg.setUsername(scan.next());
						   System.out.println("password  :");
						   reg.setPassword(scan.next());
						   System.out.println(reg.getUsername());
						   System.out.println(reg.getPassword());
						   drctry cd=new drctry();
						   reg.PasswordValidation();
						 //  System.out.println("enter the user name of the folder to store Files");
						  cd.setPath(reg.getUsername());
						  
						   break;
					case 2:System.out.println("Login");
						

							log.setPass(reg.getPassword());
							log.setUser(reg.getUsername());
							log.login();
							while(true) {
								System.out.println("MENU");
								System.out.println("3.Add  4.Search 5.View 6.Delete 7.Close Application ");
								int op = scan.nextInt();
								System.out.print("Enter your choice");
								
								switch(op) {
								case 3:
								Adding.main(null);
								break;
							
								case 4:
								srchng.main(null);	
								break;
								
								case 5: 
								viewing.main(null);
								break;
								
								case 6:
								deleting.main(null);	break;
								
								case 7:
									System.out.println("Close the Application");
									break;
								}
							}
							
					default:System.out.println("Select valid number");
					break;
			}
		}

}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
		
}
	
	}	
	}