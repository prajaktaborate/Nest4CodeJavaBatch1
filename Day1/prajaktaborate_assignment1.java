package Java_day1_package;

public class Assignment1 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	
int P1=100; //price of first dish//
int P2=150; //price of second dish//
int P3=200; //price of third dish//

double tax = 0.15; //tax percentage  //

double taxamtp1= tax*P1;//tax amount on first dish//
double taxamtp2= tax*P2;//tax amount on second dish//
double taxamtp3= tax*P3;//tax amount on third dish//

double totalpriced1=taxamtp1+P1; // total price of first dish including tax//
double totalpriced2=taxamtp2+P2; // total price of second dish including tax//
double totalpriced3=taxamtp3+P3; // total price of third dish including tax//

double billamount = totalpriced1+totalpriced2+totalpriced3; //total restaurant bill//

System.out.println("Total bill is: Rs " + billamount);
	
}
}
