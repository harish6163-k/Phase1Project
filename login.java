package com.finalproject;

import java.io.File;
import java.util.Scanner;
public class login 
{
	private String user;
	private String pass;
	int op;
   public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
void login()
   {
	
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.nextLine();
        System.out.print("Enter password:");//password:user
        password = s.nextLine();
        if(username.equals(user) && password.equals(pass))
        {
            System.out.println("login  Successful");
            
        }
        else
        {
            System.out.println("login Failed");
        }
    }
}
