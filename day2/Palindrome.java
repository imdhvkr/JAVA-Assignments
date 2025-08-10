package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str = "34343";
		boolean Palindrome = true;

		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
				Palindrome = false;
				break;
			}
		}

		if (Palindrome) {
			System.out.println(" palindrome number.");
		} else {
			System.out.println(" not palindrome number.");
		}
	}
}
