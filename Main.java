package CMPS280;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		System.out.println("Testro Database"); // Opening output line
		System.out.println("======================================");
	    
	    Scanner input = new Scanner(System.in); // Creates the scanner
		
	    
	    
	    ArrayList<Orders> price = new ArrayList<Orders> ();
	    	price.add(new Orders(1, 9.25, 3.25));
	    	price.add(new Orders(2, 6.50, 1.75));
	    	price.add(new Orders(3, 10.50, 2.50));
	    	price.add(new Orders(4, 7.75, 3.50));
	    	price.add(new Orders(5, 6.25, 1.50));
	    	price.add(new Orders(6, 8.75, 2.00));
	    	price.add(new Orders(7, 6.50, 3.00));
	    	
	    	Orders.search(price);
	    
	    ArrayList<Orders> orders = new ArrayList<Orders>(20);  	
	    	
	    	orders.add(new Orders(1, 2, 4));
	    	orders.add(new Orders(2, 3, 1));
	    	orders.add(new Orders(3, 5, 7));
	    	orders.add(new Orders(4, 1, 5));
	    	orders.add(new Orders(5, 6, 3));
	    	orders.add(new Orders(6, 4, 5));
	    	orders.add(new Orders(3, 3, 2));
	    	orders.add(new Orders(5, 3, 6));
	    	orders.add(new Orders(6, 6, 7));
	        orders.add(new Orders(2, 6, 3));
	    
	    	orders.addAll(orders);
	    	
	    	
	    	for (int i = 0; i < orders.size(); i++) { // Starts at the first index value and proceeds until size is reached.
	    	
	    	
	    	
			System.out.println("Order #: " + i);
	    	
	    	System.out.print("Table #: "); // Prints Table Number
	    	int TableNum = input.nextInt();
	    	
	    	if (TableNum >= 1 && TableNum <= 6){
               
            }
            else if (TableNum < 1 || TableNum > 6){
                throw new NumberFormatException("The table number must be between 1 and 6"); 
            }
	    	
            System.out.print("Drink #: "); // Prints Drink Order
	        int DrinkNum = input.nextInt();
	        price.get(i).getDrinkPrice();
	        
	        System.out.print("Food #: "); // Prints Food Order 
	        int FoodNum = input.nextInt();
	        price.get(i).getFoodPrice();
	        
	        System.out.print("Total: " + "$"); // Prints Total
	        System.out.print(price.get(i).getFoodPrice() + price.get(i).getDrinkPrice());
	        

	        
	    	System.out.println("\n--------------------------------------");	    	
	    
	    	
	    	} 
	}
	}

	
	    	
	
	        
	        
	    

	
	


// sort(grades, names)      Bubble Sort
	