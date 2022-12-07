
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

// Class to test ShoppingCart class
public class BagDemo
{
	public static void main(String[] args)
	{
		// Create the shopping cart bag
		BagInterface<MyType> shoppingCart = new ShoppingCart<>();
		
		// Call the testAdd method
		testAdd(shoppingCart);
		
		// Call the displayBag method
		displayBag(shoppingCart);
	}
	
	// Method to add contents to the bag
	public static void testAdd(BagInterface<MyType> shoppingCart)
	{
		shoppingCart.add(new MyType(1, "Soup", 4.00));
		shoppingCart.add(new MyType(1, "Bread", 4.50));
		shoppingCart.add(new MyType(1, "Meat", 8.00));
		shoppingCart.add(new MyType(1, "Crackers", 3.50));
		shoppingCart.add(new MyType(1, "Peppers", 3.00));
	}
	
	// Method to display the contents of the bag
	public static void displayBag(BagInterface<MyType> shoppingCart)
	{
		// Convert the bag into an array
		MyType[] myBag = shoppingCart.toArray();
		
		// For each item in the array, print the result of its toString method
		for(int i = 0; i < myBag.length; i++)
		{
			System.out.print(myBag[i].toString() + "\n");
		}
	}
}