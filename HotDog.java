package hotdog;
import java.util.*;
import javax.swing.*;

public class HotDog {
//ATTRIBUTES
	String customer;
	double price; 
	int size;
	int breadType;
	int sausageType;
	int topping; 
	
//METHODS
	void printHotDog() {
		String message = "HotDog Order Details:\n" +
                "Customer: " + this.customer + "\n" +
                "Size: " + this.size + "\n" +
                "Bread Type: " + this.breadType + "\n" +
                "Sausage Type: " + this.sausageType + "\n" +
                "Toppings: " + this.topping + "\n" +
                "Total Price: $" + this.price;

JOptionPane.showMessageDialog(null, message);
	}
	
//CONSTRUCTOR
	public HotDog(String customer, double price, int size, int breadType, int sausageType, int topping){
		this.customer = customer;
		this.price = price;
		this.size = size;
		this.breadType = breadType;
		this.sausageType = sausageType;
		this.topping = topping;
	}


}
