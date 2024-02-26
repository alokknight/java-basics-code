package InputOutput;

//To create an immutable class in Java, you need to follow these guidelines:
//Declare the class as final to prevent it from being subclassed.
//Make all fields private and final to ensure they cannot be modified after object creation.
//Do not provide any setter methods for the fields.
//If any of the fields are mutable objects, make defensive copies of them to prevent modification.
//Provide only getter methods to access the fields.
//Avoid exposing any methods that can modify the internal state of the object.
//Ensure that any methods that return mutable objects return defensive copies.

final class ImmutableClassDemo {
	final private int data;
	final private String name ;
	
	ImmutableClassDemo(int data, String name){
		this.data=data;
		this.name=name;
	}
	public int getData(){
		return this.data;
	}
	
	public String getName(){
		return this.name;
	}
	
	public static void main(String[] args) {
		
	}
}
