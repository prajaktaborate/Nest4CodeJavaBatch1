package Java_day1_package;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter first string");                   // User enter first string//
        String s1= scan.next();
        
        System.out.println("Enter second string");                   //User enter second string//
        	String s2= scan.next();
        
        	String St2 = (s1.substring(2))+(s1.substring(0,2));      //correcting second string//
        	String St1 = (s2.substring(2))+(s2.substring(0,2));      //correcting first string//  

        	System.out.println("Correct first string is :" + St1);    // printing first corrected string// 
        	System.out.println("Correct second string is :"+ St2);     //printing second corrected string//

        	
	}

}
