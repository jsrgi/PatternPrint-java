package com.logical;

import java.util.Scanner;

public class PrintingTriangle {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your number to print pattern\n");
			int n = scan.nextInt();
			int k=2*n-2;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <=k/2; j++) {
					System.out.print(" ");
					
				}
				k=k-2;
				for (int j = 1; j <=i; j++) {
					System.out.print("* ");
					
				}
				System.out.println("");
			}
			k=2*n+2;
			for (int i = n-1; i >= 1; i--) {
				for (int j =k/2; j >n; j--) {
					System.out.print(" ");
					
				}
				k=k+2;
				for (int j = 1; j <=i; j++) {
					System.out.print("* ");
					
				}
				System.out.println("");
			}
	scan.close();
	
		}

}
