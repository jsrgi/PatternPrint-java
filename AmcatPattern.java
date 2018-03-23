package com.logical;

import java.util.Scanner;

public class AmcatPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number for the pattern\n");
		int n = scan.nextInt();
		int number=n;
		
		for(int i=1;i<=n;i+=2)
	    {
		
	        int k=(i-1)*n+1;
	      
	        for(int j=0;j<n-1;j++)
	        {
					System.out.print(k+"*");
					k++;
					
				}
			 	System.out.print(k);
			 	System.out.println("");
		}
			 	if(n%2!=0)
			    {
			        number=n-1;
			    }
			    for(int i=number;i>0;i-=2)
			    {
			        int k=(i-1)*n+1;
			        for(int j=0;j<n-1;j++)
			        {
			        	System.out.print(k+"*");
			            k++;
			        }
			        System.out.print(k);
				 	System.out.println("");
			    }
			  
		
		scan.close();
	}
		
}
