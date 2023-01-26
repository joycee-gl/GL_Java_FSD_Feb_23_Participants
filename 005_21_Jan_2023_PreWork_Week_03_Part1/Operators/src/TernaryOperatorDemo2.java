
public class TernaryOperatorDemo2 {

	public static void main(String[] args) {
		
		int numberOfLaptops = 1;
		
		System.out.println("Order Confirmation : ");
		System.out.println("You want to order " 
			+ numberOfLaptops + " " + 
				numberOfLaptops(numberOfLaptops));
	}
	
	private static String numberOfLaptops(
		int numberOfLaptops) {
				
		return numberOfLaptops == 1 ? "laptop" : "laptops";
	}
}
