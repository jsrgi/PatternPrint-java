package com.logical;

import java.util.Scanner;

public class NumberPatternRepeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number to print pattern\n");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("");
			
		}
		
	scan.close();}

}
