
public class ContinueStatementPhotosUploadExample {

	public static void main(String[] args) {
		
		
		for (int photoNo = 1; photoNo <= 10; photoNo ++ ) {
			
			// Invalid File Format
			if (photoNo == 3) {
				continue;
			}
			
			System.out.println("Upload start...." + photoNo);
			
			System.out.println("Upload DONE");
		}
	}
}
