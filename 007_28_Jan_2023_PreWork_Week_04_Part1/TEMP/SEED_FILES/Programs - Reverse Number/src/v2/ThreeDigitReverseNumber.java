package v2;

public class ThreeDigitReverseNumber {
	
	static int NUMBER = 487;
	
	public static void main(String[] args) {
		
		int digitValueAt100s = NUMBER / 100;
		
		int temp = (NUMBER) % 100;
		int digitValueAt10s = temp / 10;
		
		int digitValueAt1s = NUMBER % 10;
		
		int reverseNo = (100 * digitValueAt1s) + 
						(10 * digitValueAt10s) + 
						(1 * digitValueAt100s);
		
		
		System.out.println("For the number " + NUMBER +
							" the reverse number is " +reverseNo);
		
	}
		
}
