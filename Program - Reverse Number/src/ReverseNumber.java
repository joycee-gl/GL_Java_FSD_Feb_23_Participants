
public class ReverseNumber {

	public static void main(String[] args) {
		
		int NUMBER = 123456789;
		
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
			
			intermediateResult = remainder + (intermediateResult * 10) ;
			
			tempNumber = quotient;
			
		}
		
		System.out.println("For the number " + NUMBER +
									" the reverse number is -> " + intermediateResult);
		
		
	}
	
}
