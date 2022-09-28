package com.syntax.part1;

public class Number10 {

	public static void main(String[] args) {
		// Write a program to print out duplicate elements from
		// an Array of Strings?
		String[] text = { "Hi", "Label", "Good", "Label", "Hi", "Book", "Car", "Hi", "Label" };
		String[] duplication = new String[text.length];
		int count = 0;
		boolean isFlag = false;

		for (int i = 0; i < text.length; i++) {
			isFlag = false;
			for (int j = 0; j < text.length; j++) {
				if ((i != j) && (text[i].equals(text[j]))) {
					for (int k = 0; k < count; k++) {
						if (duplication[k].equals(text[i])) {
							isFlag = true;
						}
					}
					if (!isFlag) {
						duplication[count] = text[i];
						count++;
					}
				}
			}
		}

		for (int i = 0; i < count; i++) {
			System.out.println(duplication[i]);
		}
	}

}
