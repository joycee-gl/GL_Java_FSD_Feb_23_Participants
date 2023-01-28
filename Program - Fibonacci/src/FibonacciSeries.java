
public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int SERIES_COUNT = 10;
		
		int firstNo = 0;
		int secondNo = 1;
		
		//1st value in series
		System.out.print(firstNo + ", ");
		
		//2nd value in series
		System.out.print(secondNo + ", ");
		
		//3rd number till the 10th number in series
		for (int i = 3; i <= SERIES_COUNT ; i++) {
			
			int summedNo  = firstNo + secondNo;
			
			if(i == SERIES_COUNT) {
				
				System.out.print(summedNo);
				
			} else {
				
				System.out.print(summedNo + ", ");
			}
			
			firstNo = secondNo;
			secondNo = summedNo;
			
		}
		
		
		
		
	}
	
}
