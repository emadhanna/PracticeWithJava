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
		int finalResult = 1;
		
		if (y==0) {
			
			return finalResult;
		}
		
		for (int counter = 1; counter <= y; counter++) {	
			
			finalResult *= x ;
		}
		
		return finalResult;
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
		
		do {
			System.out.println("Enter Base: ");
            while (!scan.hasNextInt()) {
                String inputValue = scan.next();
                System.out.printf("\"%s\" is not a valid base number.\n", inputValue);
                System.out.println("Enter Base: ");
            }
            base = scan.nextInt();
        } while (base < 0);

		do {
			System.out.println("Enter Exponent: ");
            while (!scan.hasNextInt()) {
                String inputValue = scan.next();
                System.out.printf("\"%s\" is not a valid exponent number.\n", inputValue);
                System.out.println("Enter Exponent: ");
            }
            power = scan.nextInt();
        } while (base < 0);
		
		scan.close();
		//Compute the result
		result = exponent(base,power);
		System.out.print("Result is ");
		System.out.print(result);
		System.out.println();
		return;
	}

}