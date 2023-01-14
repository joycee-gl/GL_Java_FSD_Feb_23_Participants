import java.util.Scanner;

public class TernaryOperatorDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of laptop(s) you want to order");
		
		Scanner scanner = new Scanner(System.in);
		int numberOfLaptops = scanner.nextInt();
		
		System.out.println("Order Confirmation");
		System.out.println("You want to order " 
			+ numberOfLaptops + " " + 
				numberOfLaptops(numberOfLaptops));
	}
	
	private static String numberOfLaptops(
		int numberOfLaptops) {
				
		return numberOfLaptops == 1 ? "laptop" : "laptops";
	}
}
