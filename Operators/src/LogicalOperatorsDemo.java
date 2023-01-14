
public class LogicalOperatorsDemo {
	
	public static void main(String[] args) {
	
		int marks = 70;
		String department = "CSE";
		float projectRating = 8.0f;
		
		if(marks > 80 && department == "CSE") {
			System.out.println("Eligible for campus placement");
		}
		
		if(marks >= 90 || projectRating >= 8.0 ) {
			System.out.println("Eligible for campus placement");
		}
		
	}
}
