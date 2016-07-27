package com.hacker.camelcase;

/*
http://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java

replaceAll("\\s","")
\w = Anything that is a word character

\W = Anything that isn't a word character (including punctuation etc)

\s = Anything that is a space character (including space, tab characters etc)

\S = Anything that isn't a space character (including both letters and numbers, as well as punctuation etc)

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_Alternative {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
       String imutableString = s.replaceAll("\\s","" );
        System.out.println(imutableString+ "Sti");
        System.out.println(s);
        int wordcount=1;
     /*   int wordcount;
        if((int)s.charAt(0)>=65 && (int)s.charAt(0) <=90){
        	
        	wordcount=0;
        }else wordcount=1; */
        int pos=0;
        
      
        for (int i=0;i<s.length();i++){
        	int asciival= (int) s.charAt(i);
        	if(asciival>=65 && asciival <=90){
        		if(i==0){
        			wordcount=0;
        		}
        		System.out.println(wordcount + ". "+s.substring(pos,i));
        		wordcount++;
            	pos=i;
        	}

        	
        }
        System.out.println(wordcount + ". "+s.substring(pos,s.length()));
        System.out.println(wordcount);
    }
}
