package com.syntax.part1;

import java.util.Scanner;

public class Number7 {

	public static void main(String[] args) {
		// Write a java program to check whether a given
		// number is prime or not?
		Scanner numbers = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int number = numbers.nextInt();

		boolean isItPrime = true;
		if (number <= 1) {
			isItPrime = false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if ((number % i) == 0) {
				isItPrime = false;
				break;
			}
		}

		if (isItPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
		numbers.close();
	}

}
