package v2;

public class StarLeftTriangle {
	
	static int COUNT = 5;

	public static void main(String[] args) {
		
//		step1();
//		step2();
//		step3();
		step4();
	}
	
	static void step1() {
		
		//printing a line of stars
		for (int index = 1; index <= COUNT; index++) {
			
			System.out.print("* ");
		}
	}
	
	static void step2() {
		
		//printing a line of stars
		for (int index = 1; index <= COUNT; index++) {
			
			System.out.print("*");
			
			System.out.print(" ");
		}
	}
	
	static void step3() {
		
		for (int outerindex = 1 ; outerindex <= COUNT; outerindex++) {
			
			//printing a line of stars
			for (int index = 1; index <= COUNT; index++) {
				
				System.out.print("*");
				
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	static void step4() {
		
		for (int outerIndex = 1 ; outerIndex <= COUNT; outerIndex++) {
			
			int uptoIndex = outerIndex;
			
			//printing a line of stars
			for (int index = 1; index<= uptoIndex; index++) {
				
				System.out.print("*");
				
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
