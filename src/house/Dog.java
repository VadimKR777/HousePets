package house;

public class Dog {
	
	private String   name; // кличка
    private double weight; // вес (граммы)
    private double    age; // возраст (дни!!!)
    
    public Dog (String name, int weight, int age ){
    	this.name   =   name;
    	this.weight = weight;
    	this.age    =    age;
    }
    
    public void eat(int quantity) {
    	age ++;
    	weight +=  quantity * 1/100;	
    	
    }
    
    public String toString() {	
    return	name + "(dog), " + "Весит " + weight/1000 + " kg," + " Возраст " + Math.rint(10 * age/365)/10 + " года";
 	
    }
}
