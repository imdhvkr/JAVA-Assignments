package week1.day2;

public class NegativetoPostive {
	public static void main(String[] args) {
		int number = -40;

		if (number < 0) {
			number = -number; 
			System.out.println("The number is negative, converted to positive: " + number);
		} else {
			System.out.println("The number is already positive: " + number);

		}
	}
}
