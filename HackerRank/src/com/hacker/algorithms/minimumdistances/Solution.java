package com.hacker.algorithms.minimumdistances;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int A[] = new int[n];
		int distances[] = new int[n];
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextInt();
		}
		in.close();
		int k = 0;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] == A[j]) {
					distances[k] = j - i;
					k++;
					flag = true;
				}

			}
		}
		if (flag) {
			int min = distances[0];
			for (int i = 1; i < k; i++) {
				if (min > distances[i]) {
					min = distances[i];
				}
			}
			System.out.println(min);
		} else
			System.out.println(-1);
	}
}
