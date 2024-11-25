package week1.day2;

public class FindFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int num1=0;
		int num2=1;
		
		for(int i =0; i<range; i++) {
			
			System.out.println(num1+"");
			int num3 =num1+num2;
			num1=num2;
			num2=num3;
		}

	}

}
