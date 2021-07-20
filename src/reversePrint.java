//Mark Boady - Drexel University - Homework Assignment

//This library makes reading integers easy
import java.util.Scanner;

class reversePrint
{
	//Print String in reverse
	//Use a while loop to print a string in reverse order.
	//Print a \n after the string so it looks pretty.
	//Use Java strings https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

	//This function should print the result using System.out.
	//Void means no return value given. (Since you print the answer)
	//This is based on HW2
	//For example reversePrint("Apple") would print elppA
	//You will only ever get 1 word to reverse, not a multi-word sentence.
	public static void reversePrint(String text)
	{
		return;
	}
	//You don't need to make any changes to the code below here
	public static void main(String[] args)
	{
		String str;
		System.out.println("Hello. This code reverses a string.");
		System.out.println("Text to reverse: ");
	
		//Read the string they typed
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		scan.close();

		reversePrint(str);
		return;
	}

}