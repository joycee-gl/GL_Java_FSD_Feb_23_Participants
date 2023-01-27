package v3;

import java.util.Scanner;

public class ReverseNumberUserInput {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to reverse "); 
		int number = input.nextInt();
		System.out.println(number);
		
			
		int tempNumber = number;
		
		int quotient = -1;
		int remainder = -1;
		
		int intermediateResult = 0;
		
		while (quotient != 0) {
			
			quotient = tempNumber / 10;
			remainder = tempNumber % 10;
			
			System.out.println();
			System.out.println("Quotient -> " + quotient);
			System.out.println("Remainder -> " + remainder);
			System.out.println("Intermediate Result -> " + intermediateResult);
					
			intermediateResult = (intermediateResult * 10) + remainder;
			
			tempNumber = quotient;
			
		}
		
		System.out.println("For the number " + number + 
							" the reverse number is " + intermediateResult);
		
		
	}
	
}
