package CMPS280;

import java.util.ArrayList;

public class Orders extends Tables implements Food,Drinks  {
	
	   public static int orderNum;    // Order Number
	        protected int drinkID;	  // Drink ID
	            double drinkPrice;    // Drink Price
	         protected int foodID;    // Food Number
	           	 double foodPrice;    // Food Price
	         private int TableNum;	  // Table Number (From Abstract)
	           	 
	
	Orders() {} // Default Constructor
	
	Orders(int TableNum, int drinkID, int foodID) {  // Utilized for (orders ArrayList)
		
		this.TableNum = TableNum;
		this.drinkID = drinkID;
		this.foodID = foodID;
		}

	public int getorderNum(int orderNum) {
		return Orders.orderNum = orderNum;
	}
	
	///////////////////////////////////////
	
	Orders(int foodID, double foodPrice, double drinkPrice) {  // Utilized for (price ArrayList)
		this.foodID = foodID;
		this.foodPrice = foodPrice;
		this.drinkPrice = drinkPrice;
		
	}
	
	
	public void setDrinkID(int number) {  // Sets drink number
		this.drinkID = number;			
	}
	
	public int getDrinkID() {  // Retrieves drink number
		return drinkID;
	}
	
	public void setDrinkPrice(double price) { // Sets drink price
	}
	
	public double getDrinkPrice() { // Retrieves drink price
		return drinkPrice;
	}
	
	public void setFoodID(int number) { // Sets food number
		this.foodID = number;	
	}
	
	public int getFoodID() { // Retrieves food number
		return foodID;
	}
	
	public void setFoodPrice(double price) {  // Sets food price
	}
	
	public double getFoodPrice() { // Retrieves food price
		return foodPrice;
	}
	
	public int getTableNum() {  // Retrieves table number
		return TableNum;
	}
	
	public void setTableNum(int table) { // Sets table number
	}

	public static void search(ArrayList<Orders> price) {
		// TODO Auto-generated method stub
		
	}
		
	}







	


		
 
    	


	

	
	
	
	
	
	

