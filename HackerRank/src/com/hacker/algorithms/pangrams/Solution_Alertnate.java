package com.hacker.algorithms.pangrams;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.ibm.security.util.Length;

public class Solution_Alertnate {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		boolean flag=false;
		
		for (int i = 97; i <=122; i++) {
			if(s.toLowerCase().contains(Character.toString((char)i))){
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