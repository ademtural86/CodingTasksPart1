package com.syntax.part1;

public class Number3 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of
		// all numbers.
		int[][] numbers = { { 1, 1, 1 }, { 1, 1 }, { 1, 1, 1, 1 }, {}, { 1, 1, 1, 1 } };

		int sum = 0;

		for (int[] outerArray : numbers) {
			for (int innerArray : outerArray) {
				sum += innerArray;
			}
		}

		System.out.println("Sum of the 2D array is: " + sum);
	}
}
