package search;

import java.util.Scanner;

public class Main {

	/*
	 * Fibonaccijeva tehnika pretraživanja je metoda pretraživanja sortiranog niza
	 * korištenjem algoritma podeli pa vladaj koji sužava moguće lokacije uz pomoć
	 * Fibonačijevih brojeva. U poređenju sa binarnim pretraživanjem, Fibonačijeva
	 * pretraga ispituje lokacije čije adrese imaju manju disperziju. Fibonačijeva
		pretraga ima prednost u odnosu na binarnu
	 * pretragu u blagom smanjenju prosečnog potrebnog vremena za pristup lokaciji
	 * za skladištenje.
	 */

	static int kk = -1, nn = -1;
	static int fib[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 98, 1597, 2584, 4181, 6765, 10946,
			17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887,
			9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141 };

	static int fibsearch(int a[], int n, long x) {
		int inf = 0, pos, k;
		if (nn != n) {
			k = 0;
			while (fib[k] < n)
				k++;
			kk = k;
			nn = n;
		} else
			k = kk;

		while (k > 0) {
			pos = inf + fib[--k];
			if ((pos >= n) || (x < a[pos]))
				;
			else if (x > a[pos]) {
				inf = pos + 1;
				k--;
			} else
				return pos;
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 45, 56, 67, 78, 89, 99, 100, 101 };
		int num, pos;
		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite element za pretraživanje: ");
		num = scan.nextInt();
		pos = fibsearch(arr, 10, num);
		if (pos >= 0)
			System.out.println("\nElement je na indeksu: " + fibsearch(arr, 10, num));
		else
			System.out.println("\nElement NIJE pronađen!! ");
		scan.close();
	}
}