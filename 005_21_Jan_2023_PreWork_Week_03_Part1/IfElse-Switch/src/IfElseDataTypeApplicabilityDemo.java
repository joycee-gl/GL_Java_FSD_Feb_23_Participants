
public class IfElseDataTypeApplicabilityDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		float f1 = 1.3F;
		float f2 = 2.5F;
		
		double d1 = 3.33D;
		double d2 = 4.44D;
		
		boolean b1 = true;
		boolean b2 = false;
		
		if (
			(a >=b) ||
			(f1 < f2) &&
			(d1 == d2) ||
			(!b1 == b2)
			) {
			
			System.out.println("Do something....");
		}
		
	}
}
 