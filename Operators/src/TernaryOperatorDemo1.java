import java.util.Scanner;

public class TernaryOperatorDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int a = scanner.nextInt();
		
		System.out.println("Enter number 2");
		int b = scanner.nextInt();
		
		System.out.println("Smaller of the two...");
		
		int smallerNumber = (a < b) ? a : b;
		System.out.println(smallerNumber);
		
		System.out.println("Larger of the two...");
		
		int largerNumber;
		if (a > b) {
			largerNumber = a;
		}else {
			largerNumber = b;
		}
		
		System.out.println(largerNumber);
	}
}
