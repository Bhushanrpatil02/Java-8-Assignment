package com.yash.java8assignment1;

import java.util.stream.IntStream;

public class PalindromOrNot1 {

	public static void main(String[] args) {
		int num = 122;
		String temp = Integer.toString(num);
		boolean val = IntStream.range(0, temp.length() / 2)
				.noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
		System.out.println("result " + val);
	}

}