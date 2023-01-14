

public class CharacterDemo1 {

	public static void main(String[] args) {
		
		
		char a = 'A';
		System.out.println("Value is ->" + a);
		System.out.println("Value is ->" + (int)a);
		
		a++;
		System.out.println("Value is ->" + a);
		
		
		a = (char)((int)a + 2);
		System.out.println("Value is ->" + a);
		
	}
}
