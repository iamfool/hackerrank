package com.hacker.array.sparsearrays;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		 int n= scan.nextInt();scan.nextLine();
		 String s[]= new String[n];
		 for(int i=0;i<n;i++)
			 s[i]=scan.nextLine();
		 int q= scan.nextInt();scan.nextLine();
		 String qs[]= new String[n];
		 for(int i=0;i<q;i++){
			 String temps= scan.nextLine();
			 int count=0;
			 for (int j = 0; j < n; j++) {
				if(temps.equals(s[j])){
					count++;
				}
			}
			 
				 System.out.println(count);
			 
			 
		 }
			 
			 
		 
		 
	}

}
