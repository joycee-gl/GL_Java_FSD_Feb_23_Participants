import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new 
			Scanner(System.in);
		
		System.out.println("Enter some text:");
		
		String text = scanner.nextLine();
		
		System.out.println("You have entered->" + text);
		
		System.out.println("Enter a number:");
		int value = scanner.nextInt();
		
		System.out.println("You have entered number as : " +value);
	}
}
