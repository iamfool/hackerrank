package com.hacker.algorithms.hike;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt(); scan.nextLine();
		String s = scan.nextLine();
		scan.close();
		int count=0;
		
		for(int i=0;i<n-2;i++){
			
			if(s.charAt(i)=='D' && s.charAt(i+1)=='U' && s.charAt(i+2)=='U'){
				count++;
			}
		}
		System.out.println(count);
		
}

}