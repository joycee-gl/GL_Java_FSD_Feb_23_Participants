
public class IfElseSpotError3 {
	
	public static void main(String[] args) {
		
		boolean someCondition = false;	
		
		int myX = -2;
		
		if(someCondition) {
			myX = myX + 2;//0
		} 
		
		if (myX == 0)
			System.out.println("myX will be zero always");
		else 
			System.out.println("myX will be having value as 2");
			System.out.println("myX got incremented because of someCondition");		

	}
	
}
