package com.hacker.algorithms.insertionsort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

	public static void insertIntoSorted(int[] ar) {
        int n= ar.length;
        
    	int e=ar[n-1];
    	System.out.println(e);
    	for(int j=n-2; j>=0; j--){
               if(e<ar[j]){
                  ar[j+1] = ar[j];
                  printArray(ar);
                   
               }else{
                   ar[j+1]=e;
                   printArray(ar);
                  break;
               }
           }
	}
}
//10
//2 3 4 5 6 7 8 9 10 1