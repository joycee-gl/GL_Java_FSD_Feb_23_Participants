
public class WideningDemo {

	public static void main(String[] args) {
		
		byte aByteValue = 10;
		
		short aShortValue = 200;
		
		int anIntegerValue = 40000;
		
		long aLongValue = 6784343231L;
		
		
		// Widening happens for integer value
		aLongValue = anIntegerValue;
		System.out.println("Long's value is ->" + aLongValue);
	
		// Widening happens for short value
		anIntegerValue = aShortValue;
		System.out.println("Integer's value is ->" + anIntegerValue);
		
		// Widening happens for byte value
		aShortValue = aByteValue;
		System.out.println("Short's value is ->" + aShortValue);
	}
	
}
