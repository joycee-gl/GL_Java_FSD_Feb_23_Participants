

public class BooleanDemo3 {

	public static void main(String[] args) {
		
		boolean b = true;
		System.out.println("Boolean value is ->" + b);
		
		if (b == true) {
			System.out.println("This will be executed only when b's value is true");
		}

		if (b) {
			System.out.println("This will also be executed only when b's value is true");
		}

		b = false;
		System.out.println("Boolean value is ->" + b);
	
		if (b) {
			System.out.println("This is never going to be printed at all...");
		}
	}
}
