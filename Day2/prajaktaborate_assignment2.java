package Java_day1_package;

public class prajaktaborate_assignment2 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
        int height_Feet=5;
        int height_Inch=6;
        int weight=67;   
		float height_cm = heightConverter(5,6);                                        // Height in cm //
		System.out.println("Height in cm = " + height_cm);
		float weight_kg = weightConverter(67);                                       //  Weight in pounds //
		System.out.println("Weight in pounds = " + weight_kg);
		
	}

	      static float heightConverter(int heightFeetPart, int heightInchPart) 
	
	      {
		
		  float ht_inch = heightFeetPart*12;                                         // Converting height feet to inches //
	      float ht_cm =  (float) (heightInchPart*2.54 + ht_inch*2.54);               // Converting height inches to cm //
	    
	      return ht_cm;
	 
           }
	
           static float weightConverter(int weight)
        
           {
	        float wt_pound = (float) (weight*2.2);                                     // Converting weight  kilograms to pounds//
	
	        return wt_pound; 
	
        }

}
