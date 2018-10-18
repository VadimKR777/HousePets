package house;

public class Owner {
	
	    private String fullname;   // ������ ���
	    private int         age;   // ������� (���)
	    private double     food;   // ������� ���� ������� � ������� (� �������)
		
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
	        return fullname + "(owner)" + " ������� " + age/365 + " ���," + " ����� � ������� " + food/1000 + "kg �����"; 	
	     }
    

}
