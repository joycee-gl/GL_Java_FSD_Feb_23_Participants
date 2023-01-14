
public class SwitchDataTypesApplicability {

	public static void main(String[] args) {
		
		// Attempt to use integer types
		// Works !
		
		int x = 10;
		
		switch (x) {
			
			case 10 : {}
			
			case 20 : {}
		}
		
		// Attempt to use char data type
		// Works
		char c = 'A';
		
		switch (c) {
			
			case 'A': {}
			
			case 'B': {}
		}
		
		// Attempt to use boolean data type
		// Doesn't work
		boolean b = false;
		
		switch (b) {
		
		}
		
		// Attempt to use float data type
		
		float f1 = 3.33F;
		
		switch (f1) {
		
		}
	}
}
