package Java_day1_package;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		long s1 = scan.nextLong();
		int even_count=0;
		int odd_count=0;
		int num;
		
		while(s1>0 || s1<0) 
		{
			num = (int) (s1%10); 
			    
			  if(num%2==0) 
			  {
				         
				 even_count++;
				             
			   }
			    
			   else 
			   { 
				   odd_count++;
				  
			   }
			  
		       s1=s1/10;
		}
		
		System.out.println("Even didgits :  " + even_count);
		System.out.println("Odd digits : "  + odd_count);      
	}	
	}
	


