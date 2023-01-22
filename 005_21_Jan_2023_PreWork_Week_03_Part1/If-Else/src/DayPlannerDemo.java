import java.util.Scanner;

public class DayPlannerDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Use this planner program to plan your day");
		
		System.out.println("Is today a work day for you (Y/N)");	
		String todayAWorkDay = scanner.nextLine();

		boolean aloneTime = false;
		
		if (todayAWorkDay.equals("Y")) {
			
			System.out.println("Program's recommendations");			
			System.out.println("You don't have much options buddy, Go to Work !");
			
		}else {
			
			System.out.println("Do you want to spend your day with friends? (Y/N)");
			String spendWithFriends = scanner.nextLine();
			
			if (spendWithFriends.equals("Y")) {
				
				System.out.println("Any of your friends available in town? (Y/N)");
				String friendsAvailableInTown = scanner.nextLine();
				
				if (friendsAvailableInTown.equals("Y")) {

					System.out.println("Program's recommendations");					
					System.out.println("Today is a holiday for you and you are friends are available for your and they are in town. Here are your options");
					System.out.println("1. Hang out with your friends");
					System.out.println("2. Go to a movie with them");					
				}else {					
					aloneTime = true;
				}
			}else {				
				aloneTime = true;
			}			
		}

		if (aloneTime) {
			
			System.out.println("Do you want to go out ?");
			String willYouGoOut = scanner.nextLine();
			
			if (willYouGoOut.equals("Y")) {
				
				System.out.println("Program's recommendations");
				System.out.println("Looks like you want to spend time alone and you are willing to go out, Ok, so, here are your options");
				System.out.println("1. Visit a nearby park");
				System.out.println("2. Go to a Spa for body/mind relaxation");
				System.out.println("3. Go to a movie alone");
			}else {

				System.out.println("Program's recommendations");
				System.out.println("Looks like ou want to spend time alone and you don't want to go out. So here are your options");
				
				System.out.println("1. Watch a movie/series in OTT");
				System.out.println("2. Sleep tight");
			}
		}
	}
}
