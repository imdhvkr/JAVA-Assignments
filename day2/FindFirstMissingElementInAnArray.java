package week1.day2;

public class FindFirstMissingElementInAnArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 7, 6, 8 };
		int n = array.length + 1;

		boolean[] present = new boolean[n + 1];
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= n) {
				present[array[i]] = true;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (!present[i]) {
				System.out.println("The first missing element is: " + i);
				break;
			}
		}
	}
}
