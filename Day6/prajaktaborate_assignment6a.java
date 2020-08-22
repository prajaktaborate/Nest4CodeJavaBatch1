package Java_day1_package;

class Switch1 {                               //Creating class Switch//

//Creating 5 properties of Switch    -  Instance variable - state //
	
int length;
int width;                                     
int height;
String color;                                            
String Material; 
String position;  

//Creating 3 behaviour of switch  - Instance methods - behaviour//

public void SwitchON() {                    
	System.out.println("switch is turned ON");
}
public void SwitchOFF(){          
System.out.println("switch is turned OFF");
}
public void SwitchNotworking(){
	System.out.println("switch is not working");
}
public void display() {
	System.out.println("length " + length);
	System.out.println("width "+ width);
	System.out.println("height "+ height);
	System.out.println("color "+ color);
	System.out.println("Material "+ Material);
}
}
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Switch1 s1 = new Switch1();
		s1.length=10;
		System.out.println("length");                     //creating 5 object if Switch class//
		Switch1 s2 = new Switch1();
		s1.width=10;
		Switch1 s3 = new Switch1();
		s1.height=10;
		Switch1 s4 = new Switch1();
		s1.color="white";
		Switch1 s5 = new Switch1();
		s1.Material="plastic";
		s1.SwitchOFF();
		s1.SwitchON();
		s1.SwitchNotworking();
		s1.display();
	}

}
