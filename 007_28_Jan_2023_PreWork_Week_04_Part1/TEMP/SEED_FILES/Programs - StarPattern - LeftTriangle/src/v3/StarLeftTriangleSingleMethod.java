package v3;

public class StarLeftTriangleSingleMethod {

	static int COUNT = 5;
	
	public static void main(String[] args) {
		
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
