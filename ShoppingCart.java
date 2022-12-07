
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

// Class to implement a bag of items using an array.
public final class ShoppingCart<T> implements BagInterface<T>
{
	// Declare and initialize variables
	private T[] bag;
	private int numberofProducts;
	private static final int DEFAULT_CAPACITY = 50;
	
	// Default constructor
	public ShoppingCart() { this(DEFAULT_CAPACITY); }
	
	// Constructor with capacity parameter
	public ShoppingCart(int initialCapacity)
	{
		@SuppressWarnings("unchecked")
		T[] tempBag = (T[])new Object[initialCapacity];
		bag = tempBag;
		numberofProducts = 0;
	}

	// Adding an item to the bag
	public boolean add(T newItem)
	{
		// If the bag is full, report so
		if(isFull())
		{
			System.out.println("The shopping cart is full.");
		}
		
		// Add the new item
		bag[numberofProducts] = newItem;
		// Increment the number of products in the cart
		numberofProducts++;
		
		return true;
	}
	
	// Retrieves all the items in the bag
	public T[] toArray()
	{
		@SuppressWarnings("unchecked")
		T[] result = (T[])new MyType[numberofProducts];
		for(int i = 0; i < numberofProducts; i++)
		{
			result[i] = bag[i];
		}
		return result;
	}
	
	// Checks if the bag is full
	private boolean isFull() { return numberofProducts >= bag.length; }
}






