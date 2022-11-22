package org.array;

import java.util.Scanner;

public class Q2Average {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int ele = s.nextInt();

		int a[] = new int[ele];
		System.out.println("Enter  all the elements ?");
		int sum = 0;
		float average = 0;
		int len = a.length;

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];

		}
		average = (float) sum / len;
		System.out.println("Sum of array elements :" + sum);
		System.out.println("Average of array elemts :" + average);

	}

}
