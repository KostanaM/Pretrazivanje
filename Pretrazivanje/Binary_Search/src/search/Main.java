package search;

public class Main {
	/*
	 * Binarno pretraživanje se radi polovljenjem niza. U prvom koraku ispitujemo
	 * srednji član niza. Ako srednji član nije onaj koji se traži onda se traži u
	 * prvoj ili drugoj polovini niza u zavisnosti od toga da li je traženi član
	 * veći ili manji. Postupak koji smo primenili na celi niz tada primjenjujemo na
	 * polovinu niza u kojoj se traženi element nalazi(ako postoji). Na ovaj način
	 * niz se u svakom koraku svodi na polovinu članova iz prethodnog koraka.
	 * Binarno pretraživanje moguće je kod sortiranih nizova. Mnogo je brže od
	 * serijskog pretraživanja.
	 */
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element se nalazi na indeksu: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element nije pronađen!");
		}
	}

	public static void main(String args[]) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;

		binarySearch(arr, 0, last, key);
	}
}