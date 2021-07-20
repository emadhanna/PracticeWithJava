//Mark Boady - Drexel University - Homework Assignment

//This library makes reading integers easy
import java.util.Scanner;

class toBinary
{
	//Print in Binary
	//Print the number given as a 8 bit binary number.
	//Print all 8 bits.
	//Assume the user will only give values from 0 to 255.
	//You may use remainders, booleans, or shift commands.
	//Print a newline after the binary value to make it easy to read.
	//This based on a question from HW2
	//Use System.out to print the values in the function
	//printBinary(75) should print 01001011
	public static void printBinary(int numToConvert)
	{
		String withLeadingZeros = String.format("%8s", Integer.toBinaryString(numToConvert)).replace(' ', '0');
		System.out.printf("The valuse of %d in binary is %s", numToConvert, withLeadingZeros);
    	return;
	}
	
	//You don't need to make any changes to the code below here
	public static void main(String[] args)
	{
		int num;
		System.out.println("Hello.");
		System.out.println("This program only works with numbers from 0 to 255.");
		//Read the number they typed
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to Convert to Binary: ");
		num = scan.nextInt();
		scan.close();
		//Compute the result
		printBinary(num);
		return;
	}

}