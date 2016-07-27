package com.hacker.camelcase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int wordcount = 1;
		for (int i = 0; i < s.length(); i++) {
			int asciival = (int) s.charAt(i);
			if (asciival >= 65 && asciival <= 90) {
				wordcount++;
			}

		}
		System.out.println(wordcount);
	}
}
