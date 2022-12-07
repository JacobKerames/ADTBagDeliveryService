
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

// Interface for bag
public interface BagInterface<T>
{
	// Add an item
	public boolean add(T newItem);
	
	// Retrieve all items in the bag
	public T[] toArray();
}
