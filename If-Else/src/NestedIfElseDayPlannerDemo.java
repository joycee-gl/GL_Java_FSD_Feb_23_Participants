
public class NestedIfElseDayPlannerDemo {

	public static void main(String[] args) {
		
		String dayOfWeek = "Friday";
		
		if (dayOfWeek.equals("Saturday") 
				|| dayOfWeek.equals("Sunday")) {

			if (dayOfWeek.equals("Saturday")) {
				
				System.out.println("Go to a movie ...");
				
			}else {
				
				System.out.println("Just relax at home and do nothing..");
				
			}			
		}else {
			
			if (dayOfWeek.equals("Monday")
				|| dayOfWeek.equals("Wednesday")
				|| dayOfWeek.equals("Thursday")) {
				
				System.out.println("Go to Gym");
			}else {
			
				System.out.println("Go to temple/mosque/church");
			}			
		}
	}
}
