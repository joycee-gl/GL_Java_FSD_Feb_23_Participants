public class TernaryOperatorDemo1 {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 20;
		
		System.out.println("Smaller of the two using ternary operator ...");
		
		int smallerNumber = (a < b) ? a : b;
		System.out.println(smallerNumber);
		
		System.out.println("Larger of the two using if else conditional statement ...");
		
		int largerNumber;
		if (a > b) {
			largerNumber = a;
		}else {
			largerNumber = b;
		}
		
		System.out.println(largerNumber);
	}
}
