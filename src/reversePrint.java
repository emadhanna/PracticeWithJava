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
		String[] captureOneWord = text.split(" ");
		char[] setOfCharacterFromFirstWordCaptured = captureOneWord[0].toCharArray();
		String wordReversed = "";
		
		for (int counter= setOfCharacterFromFirstWordCaptured.length-1; counter>=0; counter--) {
			
			wordReversed = wordReversed + (String.valueOf(setOfCharacterFromFirstWordCaptured[counter]));
		}
		
		System.out.println(wordReversed);
		return;
	}
	
//	Another Implementation Using StringBuilder
//	public static void reversePrint(String text)
//	{
//		String[] captureOneWord = text.split(" ");
//		StringBuilder strb = new StringBuilder(captureOneWord[0]);
//		strb.reverse();
//		System.out.println(strb);
//		return;
//	}
	
	//You don't need to make any changes to the code below here
	public static void main(String[] args)
	{
		String str;
		System.out.println("Hello. This code reverses a string.");
	
		//Read the string they typed
		Scanner scan = new Scanner(System.in);
	
		do {
			System.out.println("Text to reverse: ");
            while (!scan.hasNextLine()) {
                System.out.printf("Empty text is entered, please try again!");
                System.out.println("Text to reverse: ");
            }
            str = scan.nextLine();
        } while (str.isEmpty());
		
		scan.close();

		reversePrint(str);
		return;
	}

}