package com.logical;

import java.util.Scanner;

public class Numberswithoutreassigning {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number to print pattern\n");
		int n = scan.nextInt();
		int printnumber = 1;
		for (int i = 1; i <= n; i++) {
			

				for (int j = 1; j <= i; j++) {
					System.out.print(printnumber+" ");
					printnumber++;
				}
			
			
			System.out.println("");
		}

		scan.close();
	}

}
