
public class ConditionsRepresentationRelationalOperators {

	public static void main(String[] args) {
		
		boolean condition = (30 < 80);	//true	
		if (condition) {
			System.out.println("Value of condition 1 is  " + condition);			
		}
		
		condition = (80 > 30);	//true
		if (condition) {
			System.out.println("Value of condition 2 is  " + condition);			
		}
				
		condition = (3 >= 3); //true
		if (condition) {
			System.out.println("Value of condition 3 is  " + condition);			
		}

		condition = (5 <= 10); //true
		if (condition) {
			System.out.println("Value of condition 4 is  " + condition);			
		}

		condition = (3 == 10); //false
		if (condition) {
			System.out.println("Value of condition 5 is  " + condition);			
		}

		condition = (10 != 10); //false
		if (condition) {
			System.out.println("Value of condition is  " + condition);			
		}
	
	}
}
