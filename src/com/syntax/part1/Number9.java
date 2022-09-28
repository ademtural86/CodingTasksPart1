package com.syntax.part1;

public class Number9 {

	public static void main(String[] args) {

		// Maximum and minimum number in the array?

		int[] numbers = { 1, 2, 3, 4, 5, 6, -1, 8, 9, 10, 11, 12, 13 };
		int bigNumber = numbers[0];
		int smallNumber = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (bigNumber < numbers[i])
				bigNumber = numbers[i];
			if (smallNumber > numbers[i])
				smallNumber = numbers[i];
		}
		System.out.println("Maximum number of the array is = " + bigNumber);
		System.out.println("Minimum number of the array is = " + smallNumber);
	}

}
