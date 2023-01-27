
public class FibonacciSeriesCoreSingleMethod {
	
	static int SERIES_COUNT = 10;
	
	public static void main(String[] args) {
		
		int firstNo = 0;
		int secondNo = 1;
		
		//1st iteration
		System.out.print(firstNo + ", ");
		
		//2nd iteration
		System.out.print(secondNo + ", ");
		
		for (int i = 3; i <= SERIES_COUNT; i++) {
			
			int summedNo = firstNo + secondNo;
			
			System.out.print(summedNo + ", ");
			
			firstNo = secondNo;
			secondNo = summedNo;
			
		}
		
	}
}
