
public class WhileLoopSpotError1 {
	public static void main(String[] args) {
		
		boolean statusCheck = true;
		
		while (statusCheck) {
			System.out.println("inside while...");
			
			//
//			statusCheck = false;
		}
		System.out.println("after while...");
	}
}
