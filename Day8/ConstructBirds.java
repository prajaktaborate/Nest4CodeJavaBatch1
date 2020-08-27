package Java_day1_package;

public class ConstructBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bird birdObj1 = new Ostrich();
         Bird birdObj2 = new Parrot();
         ((Ostrich)birdObj1).eat("insect");
         ((Parrot)birdObj2).eat("chilly");

}
}
