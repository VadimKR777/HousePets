package house;

public class Owner {
	
	    private String fullname;   // полное имя
	    private int         age;   // возраст (дни)
	    private double     food;   // сколько пищи имеется в наличии (в граммах)
		
	    public Owner (String fullname, int age, int food ){
	    	this.fullname = fullname;
	    	this.age = age;
	    	this.food = food;
	    }
	       
	    public int getFood(int quantity) {   	
	    	age ++;
	    	food -= quantity;
	    	return  quantity;
	    }
	    
	    public double getFood() {   	
	    	
	    	return food;
	    	
	    }

	    public String toString() {	
	        return fullname + "(owner)" + " возраст " + age/365 + " год," + " Имеет в наличии " + food/1000 + "kg корма"; 	
	     }
    

}
