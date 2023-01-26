
public class SwitchWithinSwitch {

	public static void main(String[] args) {
		
//		String language = "English";
//		String movieName = "B";
		
		String language = "Hindi";
		String movieName = "C";
		
		switch (language) {
		
				case "English": {
						switch (movieName) {
	
							case "A": {
								System.out.println("Movie A");
								break;
							}
							case "B": {
								System.out.println("Movie B");
								break;
							}
	
						}
							
					}
					
				case "Hindi": {
					switch (movieName) {
	
					case "C": {
						System.out.println("Movie C");
						break;
					}
					case "D": {
						System.out.println("Movie D");
						break;
					}
	
				}
			}
					
		}
	}
}
