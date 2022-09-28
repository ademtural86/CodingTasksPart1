package com.syntax.part1;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// Using Scanner create an array of integer values. After
		// the array is created, calculate the sum of all stored
		// elements in that array.
		Scanner numbers = new Scanner(System.in);

		System.out.println("How many numbers do you want to enter: ");
		int count = numbers.nextInt();

		System.out.println("Enter " + count + " numbers: ");

		int[] numbersEntered = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.println("Enter " + (i + 1) + ". number: ");
			numbersEntered[i] = numbers.nextInt();
		}

		numbers.close();

		int sum = 0;

		for (int i = 0; i < count; i++) {
			sum += numbersEntered[i];
		}

		System.out.println("Sum of the array is = " + sum);

	}

}
