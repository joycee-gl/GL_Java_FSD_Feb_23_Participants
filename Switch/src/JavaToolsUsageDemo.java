import java.util.Scanner;

public class JavaToolsUsageDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter an option (1/2/3)");
		System.out.println("1. javac");
		System.out.println("2. java");
		System.out.println("3. javadoc");
		
		Scanner scanner = new Scanner(System.in);
		
		if (scanner.hasNextInt()) {

			int userInput = scanner.nextInt();

			switch (userInput) {
			
				case 1: {
					
					System.out.println("Javac is a compiler for Java that is used to compile java source code to byte code");
					break;
				}
				case 2: {
					
					System.out.println("Java is the JVM which is used to run java programs");
					break;
				}case 3: {
					
					System.out.println("Javadoc is used to generate HTML report from java source files");
					break;
				} default: {
					
					System.out.println("Invalid user input. Supported inputs are 1/2/3");
					break;
				}
			}
			
		}else {
			
			System.out.println("Only integer inputs are accepted. Valid inputs are 1/2/3");
		}		
	}
}
