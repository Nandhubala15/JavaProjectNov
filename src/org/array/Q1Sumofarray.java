package org.array;

public class Q1Sumofarray {

	public static void main(String[] args) {

		int sum = 0;

		float average = 0;

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int length = a.length;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		average = (float) sum / length;

		System.out.println("Sum of array elements :" + sum);
		System.out.println("Average of array elemts :" + average);
	}

}
