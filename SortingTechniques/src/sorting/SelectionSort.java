package sorting;

import java.util.Arrays;

//Selection Sort  Time Complexity Best/Worst -> O(N^2) 
//Selection sort works by finding max(for desc) or min(for asc) elements and put them in correct position
public class SelectionSort {
	
	
	static void sort(int A[]) {
		int n= A.length;
		//int temp = 0;
		for(int i=0; i<n-1; i++) {
			int minimum = i;
			//find min element
			for(int j=i+1; j<n; j++) {
				if(A[j] < A[minimum]) {
					minimum= j;
				}
			}
			//swap min elements position in array 
			int temp = A[minimum];
			A[minimum] = A[i];
			A[i] =  temp;
		}
	}

	public static void main(String[] args) {
		int A[] = { 4, 2, 3, 5, 8, 1, 6 };
		sort(A);
		System.out.println(Arrays.toString(A));
	}

}
