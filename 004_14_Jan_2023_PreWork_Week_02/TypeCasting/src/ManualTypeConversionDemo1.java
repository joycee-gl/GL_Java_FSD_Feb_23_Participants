
public class ManualTypeConversionDemo1 {

	public static void main(String[] args) {
		
		// Example 1
		
		double d1 = 10.3;
		double d2 = 3.1;
		
		int x =(int) (d1/d2);
		System.out.println("X's value ->" + x);
		
		// Example 2
		
		long aLongValue = 123;
		byte abyteValue1 = (byte)aLongValue;
		
		System.out.println("Byte value is " + abyteValue1);
	
	
		aLongValue = 123456789123456L;
		abyteValue1 = (byte)aLongValue;
		
		System.out.println("Byte value is " + abyteValue1);
		
	}
}
