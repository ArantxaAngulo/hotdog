package hotdog;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class MainPage {
	public static void main(String[] args) {
	
	double price = 0;
	String[] sizeOption = {"Small", "Medium", "Big"};
	String[] breadTypeOption = {"Whole Wheat", "Integral", "SPECIAL!: Pretzel"};
	String[] sausageTypeOption = {"Pork", "Turkey", "Vegan"};
	String[] toppingOption = {"Avocado", "Bacon", "Hot Peppers", "Ketchup", "Mayo", "BBQ"};
		
//Hello! Place your order

	Scanner scan = new Scanner(System.in); // scanner creation
		
	int answer = JOptionPane.showConfirmDialog(null, "Hi! Welcome to HOTDOG-PLACE! Would you like to order?");
	        
	        if (answer != 0) { //answer management, 0 = yes
	            JOptionPane.showMessageDialog(null, "Have a great day! Return later! :3");
	            System.exit(0); // End the program
	        }
	        
	String costumer = JOptionPane.showInputDialog("What is your name?: "); //Costumer name
    int size =  JOptionPane.showOptionDialog(null, "Choose a size for your HotDog:", "HotDog Size",  //HotDog size
    		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
            JOptionPane.QUESTION_MESSAGE, // Message type
            null,                      // Icon (null for default)
            sizeOption,                  // Options array
            sizeOption[0]                // Default option            
    );
    int breadType =  JOptionPane.showOptionDialog(null, "Choose a bread for your HotDog:", "HotDog Bread",  //HotDog size
    		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
            JOptionPane.QUESTION_MESSAGE, // Message type
            null,                      // Icon (null for default)
            breadTypeOption,                  // Options array
            breadTypeOption[0]                // Default option            
    );
    int sausageType =  JOptionPane.showOptionDialog(null, "Choose a sausage for your HotDog:", "HotDog Sausage",  //HotDog size
    		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
            JOptionPane.QUESTION_MESSAGE, // Message type
            null,                      // Icon (null for default)
            sausageTypeOption,                  // Options array
            sausageTypeOption[0]                // Default option            
    );
    int topping =  JOptionPane.showOptionDialog(null, "Choose ONE topping for your HotDog:", "HotDog Topping",  //HotDog size
    		JOptionPane.YES_NO_CANCEL_OPTION, // Option type
            JOptionPane.QUESTION_MESSAGE, // Message type
            null,                      // Icon (null for default)
            toppingOption,                  // Options array
            toppingOption[0]                // Default option            
    );
    


    
//Creating hotdog ...
		HotDog hotdog0 = new HotDog(costumer, price, size, breadType, sausageType, topping );

//Printing Order
		hotdog0.printHotDog();
	}
}
