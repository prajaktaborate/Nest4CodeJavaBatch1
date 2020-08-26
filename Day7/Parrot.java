package Java_day1_package;


	public class Parrot extends Bird implements FlyBehaviour{
		
		
		public void fly() {
		      System.out.println("Parrot can fly");
		}
			      @Override
			      public void swim() {
			    	  System.out.println("Parrot cannot swim");
			    	  
			      }
	}	
	
	
