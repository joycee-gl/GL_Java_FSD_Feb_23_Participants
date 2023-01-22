import java.util.Scanner;

public class IfElseIfElseIfMovieRecommenderDemo {

	public static void main(String[] args) {
		
		System.out.println("Movie Recommender !!!");
		
		System.out.println("ENGLISH [E]");
		System.out.println("HINDI [H]");
		System.out.println("TELUGU [TE]");
		System.out.println("TAMIL [TA]");
		System.out.println("MALAYALAM [M]");

		System.out.println("Enter your movie Language choice (E / H / TE / TA / M)");

		Scanner scanner = new Scanner(System.in);
		String movieLanguageChoice
			= scanner.nextLine();
		
		if (movieLanguageChoice.equals("E")) {
			
			System.out.println("Bullet Train");
			System.out.println("Top Gun - 2");
		}else if (movieLanguageChoice.equals("H")) {
			
			System.out.println("Taare Zameen Par");
			System.out.println("Brahmastra");
		}else if (movieLanguageChoice.equals("TE")) {
			
			System.out.println("Godfather ");
			System.out.println("RRR");
		}else if (movieLanguageChoice.equals("TA")) {
			
			System.out.println("PS 1");
			System.out.println("Vikram");
		}else if (movieLanguageChoice.equals("M")) {
			
			System.out.println("Salute");
			System.out.println("Hridayam");
		}else {
			
			System.out.println("Invalid movie language choice. Try again");
		}		
	}
}
