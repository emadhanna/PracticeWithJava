//Mark Boady - Drexel University - Homework Assignment

//This library makes reading integers easy
import java.util.Scanner;

class exponent
{
	//Compute and return x^y
	//Use a while loop and repeated multiplication.
	//This algorithm is from HW2
	//For example exponent(3,4)=3^4=81
	public static int exponent(int x, int y)
	{
		return 0;
	}
	//You don't need to make any changes to the code below here
	public static void main(String[] args)
	{
		int base;
    	int power;
    	int result;
		System.out.println("Hello. Enter Values to compute exponent.");
		//Read the number they typed
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Base: ");
		base = scan.nextInt();
		System.out.println("Enter Exponent: ");
		power = scan.nextInt();
		scan.close();
		//Compute the result
		result = exponent(base,power);
		System.out.print("Result is ");
		System.out.print(result);
		System.out.println();
		return;
	}

}