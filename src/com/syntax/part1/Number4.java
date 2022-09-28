package com.syntax.part1;

public class Number4 {

	public static void main(String[] args) {
		// Create a 2D array or integer type where you will store
		// odd and even numbers. Develop a program which will
		// identify/print the even numbers only.
		int[][] oddEvenNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println("Even numbers are: ");
		for (int i = 0; i < oddEvenNumbers.length; i++) {
			for (int j = 0; j < oddEvenNumbers[i].length; j++) {
				if (oddEvenNumbers[i][j] % 2 == 0) {
					System.out.println(oddEvenNumbers[i][j]);
				}
			}
		}

	}

}
