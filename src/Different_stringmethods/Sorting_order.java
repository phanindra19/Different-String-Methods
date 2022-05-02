package Different_stringmethods;

import java.util.Arrays;

public class Sorting_order {

	public static void main(String[] args) {

		int a[] = { 1, 2, 6, 5, 9, 7, 3, 4, 8, 10 };

		System.out.println("Array before sorting:" + Arrays.toString(a));

		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		System.out.println("Array after sorting:" + Arrays.toString(a));
	}

}
