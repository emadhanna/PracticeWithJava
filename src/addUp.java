//Mark Boady - Drexel University - Homework Assignment

//This library makes reading integers easy
import java.util.Scanner;

class addUp
{
	//Recursive Add Up
	//This function MUST be defined recursively
	//Implement the ADDUP function from HW3
	/*
 	Function addUp(n)
     If(n==0)
         return 0
     Else
         return n + addUp(n-1)
     EndIf
 	EndFunction
 	*/
	public static int addUp(int n)
	{
		return 0;
	}
	//You don't need to make any changes to the code below here
	public static void main(String[] args)
	{
		int num;
		int result;
		System.out.println("Hello.");
		System.out.println("This program recursively adds up numbers from 0 to n");
		System.out.println("Enter Number for n: ");
		//Read the number they typed
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		scan.close();
		//Compute the result
		result = addUp(num);
		System.out.print("Result is ");
		System.out.print(result);
		System.out.println();
		return;
	}

}