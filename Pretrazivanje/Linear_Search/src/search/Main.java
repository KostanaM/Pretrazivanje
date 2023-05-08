package search;

public class Main {
	/*
	 * Linearno pretraživanje je najprimitivnija tehnika traženja elemenata u zbirci
	 * podataka. Ovaj proces ide korak po korak gde se svaki element popisa
	 * proverava počevši od vrha.
	 */

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;

		System.out.println(key + " nalazi se na indeksu: " + linearSearch(a1, key));
	}
}