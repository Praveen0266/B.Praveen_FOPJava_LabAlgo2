package com.glearning.lab;

import java.util.Scanner;

public class CurrencyDenomination {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in); 
				System.out.println("Enter the amount: ");

				int value=sc.nextInt();


				int [] sortedDenominators= {2000, 500, 100,50,20,10,5};
				int targetAmt = value;

				System.out.println("Amount denominated is as follows::");
				for(int index = 0; index<sortedDenominators.length; index++) {
					
					if(targetAmt>=sortedDenominators[index]) {
						int denominator = sortedDenominators[index];
						int noOfNotes = targetAmt/denominator;
						
						System.out.println(noOfNotes+": of denominator "+denominator);
						
						targetAmt = targetAmt%denominator;
						
					}
				}
				if(targetAmt>0) {
				System.out.println("Remaining Balance for change is : "+targetAmt);
				}
			}
	
		
	}