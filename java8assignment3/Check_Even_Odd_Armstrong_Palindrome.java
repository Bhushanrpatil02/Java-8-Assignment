package com.yash.java8assignment3;

import java.util.Scanner;

interface Check3 {

	void print();

}

public class Check_Even_Odd_Armstrong_Palindrome {

	public static void main(String[] args) {

		Check3 c = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Two number");
		int value = scan.nextInt();
		scan.nextLine();
		switch (value) {

		case 1:
			c = () -> {
				System.out.println("Enter second number");
				if (scan.nextInt() % 2 == 0) {
					System.out.println("number is even");
				} else {
					System.out.println("number is not even");
				}
			};
			c.print();
			break;
		case 2:
			System.out.println("Enter second number");
			c = () -> {
				int i = scan.nextInt();
				if (i % 2 != 0) {
					System.out.println("number is an odd");
				} else {
					System.out.println("number is not an odd");
				}
			};
			c.print();
			break;
		case 3:
			c = () -> {
				System.out.println("Enter second number");
				int i = scan.nextInt();
				int temp = i, num = i, count = 0, mul, sum = 0;

				while (temp != 0) {
					temp = temp / 10;
					count++;
				}
				while (i != 0) {
					int digit = i % 10;
					mul = 1;
					for (int j = 1; j <= count; j++) {
						mul = mul * digit;
					}
					sum = sum + mul;
					i = i / 10;
				}
				if (num == sum) {
					System.out.println("Number Is An ArmStrong");
				} else {
					System.out.println("Number Is An Not ArmStrong");
				}

			};
			c.print();
			break;
		case 4:
			System.out.println("Enter Second number");
			c = () -> {
				int i = scan.nextInt(), num, digit, rem = 0;
				num = i;
				while (i != 0) {
					digit = i % 10;
					rem = rem * 10 + digit;
					i = i / 10;
				}
				if (num == rem) {
					System.out.println("Number is Palindrom");
				} else {
					System.out.println("Number is not Palindrom");
				}
			};
			c.print();
			break;
		default:
			System.out.println("Enter valid number");
			break;

		}
	}
}
