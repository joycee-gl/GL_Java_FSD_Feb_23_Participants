package v2;

//import java.util.Scanner;

public class ReverseNumber {

	static int NUMBER = 73421;
	
	public static void main(String[] args) {
		//step1();
		step2();
	}
	
	static void step1() {
		
		int tempNumber = NUMBER;
		
		int quotient = -1;
		int remainder = -1;
		
		while (quotient != 0) {
			
			quotient = tempNumber / 10;
			remainder = tempNumber % 10;
			
			System.out.println();
			System.out.println("Quotient -> " + quotient);
			System.out.println("Remainder -> " + remainder);
			
			tempNumber = quotient;
			
		}
	}
	
	static void step2() {
		
		int tempNumber = NUMBER;
		
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
		
		System.out.println("For the number " + NUMBER + 
							" the reverse number is " + intermediateResult);
		
	}
	
	
	
}
