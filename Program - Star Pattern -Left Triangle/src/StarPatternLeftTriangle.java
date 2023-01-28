
public class StarPatternLeftTriangle {
	
	public static void main(String[] args) {
		
		int ROW_COUNT = 5;
		
		// outer for loop - controls the no of Lines/Rows to print
		for (int outerIndex = 1; outerIndex <= ROW_COUNT ; outerIndex++) {
			
			int uptoIndex = outerIndex;
			
			// inner for loop - decides what to print in each line/row
			for (int index = 1; index <= uptoIndex; index++) {
				
				System.out.print("*");
				System.out.print(" ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
