
public class ThreeDigitReverseNumber {
	
	public static void main(String[] args) {
	
		int NUMBER = 387;
		
		// x - value at 100's
		int digitValueAt100s = NUMBER / 100;//3
		
		//y - value at 10's
		int temp = (NUMBER) % 100;//87
		int digitValueAt10s = temp / 10; //8
		
		//z - value at 1's
		int digitValueAt1s = NUMBER % 10;//7
		
		int reverseNo = (100 * digitValueAt1s) +
								(10 * digitValueAt10s) + 
								(1 * digitValueAt100s);
		
		System.out.println("For the number " + NUMBER + " the reverse number is " + reverseNo);
	
		
		
	}
	
}
