package main;
import house.Dog;
import house.Owner;

public class HousePets {

	public static void main(String[] args) {
		
		
		Dog dog1 = new Dog("Жучка",1000,620);
		Owner ow1 = new Owner("Ion Petru",7300,80000);
	
		
		while (ow1.getFood() != 0) {
			
			dog1.eat(ow1.getFood(200)); 
			System.out.println(ow1);
			System.out.println(dog1);

	    }
	}
}