package sorting;

import java.util.Arrays;

//Time Complexity  Best - O(N)  Worst - O(N^2)

//Algorithm that works by repeatedly stepping through lists to be sorted, 
//comparing each pair of adjacent items and swapping them if they are in the wrong order.
public class BubbleSort {

	static void sort(int A[]) {
		int n = A.length;
		if (n > 0) {
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i-1; j++) {
					if (A[j] > A[j + 1]) {
						temp = A[j];
						A[j] = A[j + 1];
						A[j + 1] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int A[] = { 4, 2, 3, 5, 8, 1, 6 };
		sort(A);
		System.out.println(Arrays.toString(A));
	}

}
