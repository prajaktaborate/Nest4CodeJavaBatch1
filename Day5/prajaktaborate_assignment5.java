package Java_day1_package;

import java.util.Scanner;

public class print_pattern {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter number");         //User input number to print pattern//
     int num = scan.nextInt();
		
     
     for (int i=0;i<num;i++)
    {
    	
    	for (int j=0;j<=i;j++)
    		
    	{
    	   System.out.print("*");    //prints star  //
    	 
           }
    	
     System.out.println();         //moves the cursor in the next line after printing each line// 
	 }
	
            for (int k=num-1;k>0;k--)
             {
                  for (int l=1;l<=k;l++)
    	         {
    	          System.out.print("*");
    
    	      }
    	 	
    	System.out.println(); 
	}

	}
	
	}


	

