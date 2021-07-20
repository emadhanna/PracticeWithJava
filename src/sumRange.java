//Mark Boady - Drexel University - Homework Assignment

//This library makes reading integers easy
import java.util.Scanner;

class sumRange
{
	//Sum Numbers in a Range
	//Use a for/while loop to sum all numbers in a range
	//This is based on an algorithm from HW2
	//Sum all numbers from x to y
	//For example sumRange(2,5)=2+3+4+5=14
	public static int sumRange(int x, int y)
	{	
		int result = 0;
		for (int counter = x; counter <= y; counter++) {
			result += counter;
		}
		return result;
	}
	
	//You don't need to make any changes to the code below here
	public static void main(String[] args)
	{
		int start;
		int stop;
		int result;
		System.out.println("Hello.");
		//Read the number they typed
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Enter Starting Value: ");
            while (!scan.hasNextInt()) {
                String inputValue = scan.next();
                System.out.printf("\"%s\" is not a valid start number.\n", inputValue);
                System.out.println("Enter Starting Value: ");
            }
            start = scan.nextInt();
        } while (start < 0);
				
		do {
			System.out.println("Enter Stopping Point: ");
            while (!scan.hasNextInt()) {
                String inputValue = scan.next();
                System.out.printf("\"%s\" is not a valid stop number.\n", inputValue);
                System.out.println("Enter Stopping Point: ");
            }
            stop = scan.nextInt();
        } while (stop < 0 || stop < start);
		
		scan.close();
		//Compute the result
		result = sumRange(start,stop);
		System.out.print("The result is ");
		System.out.println(result);
		return;
	}

}