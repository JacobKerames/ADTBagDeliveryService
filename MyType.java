
/*

Jacob Kerames

Project Name: Program 1(On-Line Food Delivery Service)

Project Purpose: Demonstrate an understanding of working with bags in Java.

Algorithm Used: The class ShoppingCart implements the BagInterface. A custom type is used to define the elements in the bag.

Program Inputs: The program takes a customer number, an item name, and an item price for each element.

Program Outputs: The program outputs the customer number, item name, and item price for each element of MyType in the bag.

Program Limitations: The program does not currently accept input from the command line. Elements of myType are added using the testAdd method.

Program Errors: The program does not have any errors.

*/

// Class for MyType, which describes an item of a customer in the cart
public class MyType
{
	// Declare variables
	int customerNumber;
	String itemName;
	double price;
	
	// Constructor method
	public MyType(int customerNumber, String itemName, double price)
	{
		this.customerNumber = customerNumber;
		this.itemName = itemName;
		this.price = price;
	}
	
	// toString method
	public String toString()
	{
		String string = String.format("Customer: %s\nItem: %s\nPrice: $%.2f\n", this.customerNumber, this.itemName, this.price);
		return string;
	}
}
