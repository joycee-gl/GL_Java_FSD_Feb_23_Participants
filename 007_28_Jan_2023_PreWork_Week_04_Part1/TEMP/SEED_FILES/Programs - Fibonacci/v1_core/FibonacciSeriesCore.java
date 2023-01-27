
public class FibonacciSeriesCore {

	static int SERIES_COUNT = 10;
	
	public static void main(String[] args) {
		
//		step1();
//		step2();
//		step3();
		step4();
	}

	static void step1() {
		
		int firstNo = 0;
		int secondNo = 1;
		
		//1st iteration
		System.out.print(firstNo + ", ");
		
		//2nd iteration
		System.out.print(secondNo + ", ");
	}
	
	static void step2() {
		
		int firstNo = 0;
		int secondNo = 1;
		
		//1st iteration
		System.out.print(firstNo + ", ");
		
		//2nd iteration
		System.out.print(secondNo + ", ");
		
		//iterations 3 to 10
		for (int i = 3; i <= SERIES_COUNT; i++) {
			System.out.print("NextNo, ");
		}
				
	}
	
	static void step3() {
		
		int firstNo = 0;
		int secondNo = 1;
		
		//1st iteration
		System.out.print(firstNo + ", ");
		
		//2nd iteration
		System.out.print(secondNo + ", ");
		
		for (int i = 3; i <= SERIES_COUNT; i++) {
			
			int summedNo = firstNo + secondNo;
			
			System.out.print(summedNo + ", ");
		}
		
	}
	
	static void step4() {
		
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
