package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		
		int n = 8;
		int a = 0, b = 1, c;
		System.out.println( " Fibonacci Series " + n + " terms:");
		System.out.println( a + " " + b);
		for (int i = 2; i < n; i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
