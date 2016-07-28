package com.hacker.algorithms.pangrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.ibm.security.util.Length;

public class Solution {

	public static void main(String[] args) {
		String alpha="abcdefghijklmnopqrstuvwxyz";
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		boolean flag=false;
		s=s.toLowerCase();
		for (int i = 0; i <alpha.length(); i++) {
			if(s.contains(Character.toString(alpha.charAt(i)))){
				flag=true;
			}else{
				flag=false;
				break;
			}

		}
		if(flag)
		System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}