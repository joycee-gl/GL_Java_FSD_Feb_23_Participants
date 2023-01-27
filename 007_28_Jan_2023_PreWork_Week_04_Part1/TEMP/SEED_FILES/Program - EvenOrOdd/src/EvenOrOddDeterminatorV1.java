import java.util.Scanner;

public class EvenOrOddDeterminatorV1 {
	
	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			boolean userWantsToContinue = true;
			
			while (userWantsToContinue) {
				
				System.out.println("If you wish to continue, type 1. To exit, type 2");
				
				int userOption = input.nextInt();
				
				if(userOption == 1) {
					
					System.out.println("Enter the number to check for even/odd");
					int number = input.nextInt();
						
					if((number % 2) == 0) {
						
						System.out.println("Number " + number + " is even");
						System.out.println();
					} else {
						
						System.out.println("Number " + number + " is odd");
						System.out.println();
						
					}
				} else {
					System.out.println("Exiting application...");
					userWantsToContinue =  false;
				}
 					
									
			}
			
		}

}
