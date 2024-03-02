package com.sddevops.project.mavern.eclipse;

import java.util.Scanner;

public class NavigationBar {
	private static Scanner myObj;

	public static void main(String[] args) {
	    myObj = new Scanner(System.in);
	    String userName;
	    
	    // Enter username and press Enter
	    System.out.println("Enter username"); 
	    userName = myObj.nextLine();   
	       
	    System.out.println("Username is: " + userName);        
	  }
}
