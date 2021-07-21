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
		String remainder = "";
		String binaryRepresentation = "";
		int countLeadingZeros = 0 ;
		String addingLeadingZeros = "";
		
		do {
			remainder += Integer.toString(numToConvert%2);
			numToConvert /= 2;
		}while(numToConvert > 0);
		
		char[] revervseTheBinaryRepresentation = remainder.toCharArray();
		
		for (int counter = revervseTheBinaryRepresentation.length-1; counter>=0; counter--) {
			
			binaryRepresentation += String.valueOf(revervseTheBinaryRepresentation[counter]);
		}
		
		countLeadingZeros = 8 - binaryRepresentation.length();
		
		if (countLeadingZeros > 0) {
			
			for (int counter = 0; counter < countLeadingZeros ; counter++) {
				
				addingLeadingZeros += "0";
			}
		}
		
		binaryRepresentation = addingLeadingZeros + binaryRepresentation;
		System.out.printf("The valuse of %d in binary is %s", numToConvert, binaryRepresentation);
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
		
		do {
			System.out.println("Enter Number to Convert to Binary: ");
            while (!scan.hasNextInt()) {
                String inputValue = scan.next();
                System.out.printf("\"%s\" is not a valid base number.\n", inputValue);
                System.out.println("Enter Number to Convert to Binary: ");
            }
            num = scan.nextInt();
            if (!(num >=0 && num <=255)) {
            	System.out.println("Make sure the number is between 0 and 255");
            	continue;
            }
        } while (!(num >=0 && num <=255));
		
		scan.close();
		//Compute the result
		printBinary(num);
		return;
	}

}