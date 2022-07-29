package Revision;
// if exception is generate in age class than Age_Exception will be call
public class Age_Exception extends Exception{
	// constructor calling by the another class
	Age_Exception(String msg)
	{
		// paasing a msg by super key word to parent class
		super(msg);
	}
	
}
