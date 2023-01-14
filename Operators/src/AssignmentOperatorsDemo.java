public class AssignmentOperatorsDemo {
	
	public static void main(String[] args){
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("Initial value of a is " +a);

		a = b + c;
		System.out.println("Value of a is " +a);

		a += b;
		System.out.println("Value of a is " +a);

		a += 2;
		System.out.println("Value of a is " +a);

		a %= 10;
		System.out.println("Value of a is " +a);

	}
}