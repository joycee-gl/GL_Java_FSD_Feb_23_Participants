
public class BreakStatementWithinForLoop {

	public static void main(String[] args) {
		
		
		for (int counter = 1; counter <=10; counter ++) {
			
			
			if (counter == 7) {
				System.out.println("Break out from for-loop");
				break;
			}
			
			System.out.println("Processing counter value " + counter);
		}		
		
		System.out.println("Control comes here..");
	}
}
