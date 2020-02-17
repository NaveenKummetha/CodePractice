package com.hackerrank.practice;

import java.util.Scanner;

public class ReadingInputFromScanner {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println(first * second);
	}
}