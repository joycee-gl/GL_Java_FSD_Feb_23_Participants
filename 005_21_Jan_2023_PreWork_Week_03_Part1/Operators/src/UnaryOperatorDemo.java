
public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = a++;//a--
		
		System.out.println(a + ", " + b);
		
		int c = 15;
		int d = ++c;//--c
		
		System.out.println(c + ", " + d);
		
		a++;
		System.out.println(a);
		
	}
}
