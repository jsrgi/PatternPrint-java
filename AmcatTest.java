package com.logical;

import java.util.Arrays;
import java.util.Scanner;

public class AmcatTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your size of an array\n");
		int n = scan.nextInt();
		System.out.println("Enter your array value :\n");
		int[] array=new int[n];
		for (int i = 0; i <n; i++) {
			array[i]=scan.nextInt();
			
		}
		Arrays.sort(array);
		int[] temp=new int[n];
		int a=0;
		for (int i = 0; i <n-1; i++) {
			
				if(array[i]!=array[i+1])
				{
				
					temp[a++]=array[i];
					
				}
			
		}
		 temp[a++] = array[n-1]; 
		
		for (int i = 0; i <a; i++) {
			System.out.print("{"+temp[i]+"}");
			
		}
		scan.close();
	}

}
