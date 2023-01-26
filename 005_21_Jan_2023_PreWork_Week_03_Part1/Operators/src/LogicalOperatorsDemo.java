
public class LogicalOperatorsDemo {
	
	public static void main(String[] args) {
	
		int marks = 85 ;
		String department = "CSE";
		float projectRating = 8.0f;
		
		boolean isTaskCompleted = true;
		
		if(marks > 80 && department == "CSE") {
			System.out.println("Eligible for campus placement - 1");
		}
		
		if(marks >= 90 || projectRating >= 7.0 ) {
			System.out.println("Eligible for campus placement - 2");
		}
		
		System.out.println("!isTaskCompleted " + (!isTaskCompleted));
		
	}
}
