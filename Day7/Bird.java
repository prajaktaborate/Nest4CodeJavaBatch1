package Java_day1_package;

public abstract class Bird {            // Abstract class Bird//
	
	String color;                        //Properties//
	int  height;                                       
	int weight;                           
	String sound;                                   
	
	public void eat() {                           //first non abstract method//
		System.out.println("All birds eat");                          
	}
     public void sleep() {                        //second non abstract method//            
	System.out.println("All birds sleep");
}

public abstract void fly();                        //first abstract method//
public abstract void swim();                       //second abstract method// 

}

