
public class AutomaticTypeConversionIncompatibleTypes {

	public static void main(String[] args) {
		
		// Attempting to assign boolean to a float
		
		boolean condition = false;
		
		float f1 = condition;
		
		// Attempting to assign double to a character

		double d1 = 100.347;

		char s = d1;	
	}
}
