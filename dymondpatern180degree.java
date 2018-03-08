package com.logical;

import java.util.Scanner;

public class dymondpatern180degree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number to print pattern\n");
		int n = scan.nextInt();
		int k=2*n-2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=k; j++) {
				System.out.print(" ");
				
			}
			k=k-2;
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		scan.close();
	}
}
