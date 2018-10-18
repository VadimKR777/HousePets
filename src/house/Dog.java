package house;

public class Dog {
	
	private String   name; // ������
    private double weight; // ��� (������)
    private double    age; // ������� (���!!!)
    
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
    return	name + "(dog), " + "����� " + weight/1000 + " kg," + " ������� " + Math.rint(10 * age/365)/10 + " ����";
 	
    }
}
