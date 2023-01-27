package v2_via_class;

public class FibonacciSeries {
	
	int seriesCount = 10;

	public void computeAndDisplay() {
		
		int firstNo = 0;
		int secondNo = 1;		
		
		// 1st Iteration
		System.out.print(firstNo + ", ");
		
		// 2nd Iteration
		System.out.print(secondNo + ", ");		
			
		for (int i = 3; i <= seriesCount; i ++) {

			int summedNo = firstNo + secondNo;
			
			System.out.print(summedNo + ", ");		
			
			firstNo = secondNo;
			secondNo = summedNo;					
		}		
	}
	

}
