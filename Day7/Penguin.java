package Java_day1_package;


public class Penguin extends Bird implements SwimBehaviour{
	

	public void fly() {
	      System.out.println("Penguin can fly");
	}
	      
		      @Override
		      public void swim() {
		    	  System.out.println("Penguin can swim");
		      }
}	

