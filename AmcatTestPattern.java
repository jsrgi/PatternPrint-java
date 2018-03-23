package com.logical;

import java.util.Scanner;

public class AmcatTestPattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number for the pattern\n");
		int n = scan.nextInt();
		int number=0;
		int firstend=0;
		int lastend=0;
		for (int i = 1; i <= n; i++) {
			
			for(int j=1;j<=n;j++){
				if(i==1)
				{
					System.out.print(j+"*");
					firstend=j+1;
					lastend=j;
					
				}
				else if(i==n)
				{
					
					int jvalue=j;
					j=firstend;
					System.out.print(j+"*");
					lastend=j;
					firstend++;
					j=jvalue;
				}
				else
				{
					if(i%2==0){
						int jvalue=j;
						int firstj=0;
						if(lastend==(firstend-1)){
							firstj=(lastend*2)+1;
							lastend=firstj;
							j=firstj;
						}
						else{
							firstj=lastend;
							j=firstj;
						}
						System.out.print(j+"*");
						//lastend=j;
						lastend++;
						j=jvalue;	
						number=firstj;
					}
					else
					{
						int jvalue=j;
						int firstj=0;
					/*System.out.println(number);
					System.out.println(firstend-1);
					System.out.println(i);*/
						if(number==((firstend-1)*i)){
							firstj=(number+n)+1;
							number=firstj;
							j=firstj;
						}
						else{
							firstj=number;
							j=firstj;
						}
						System.out.print(j+"*");
						//lastend=j;
						number++;
						j=jvalue;	
					}
				}
			}
			System.out.println("");
			
		}
		scan.close();
	}
		
}
