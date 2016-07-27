package com.hacker.triplet;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        in.close();
        int aliceCount=0;
        int  bobCount=0;
        if(a0>=1 && a0 <=100 && b0 >=1 && b0<=100){
        	if(a0 > b0) aliceCount++;
        	if(a0< b0) bobCount++; 
        	
        }
        if(a1>=1 && a1 <=100 && b1 >=1 && b1<=100){
        	if(a1> b1)  aliceCount++;
        	if(a1< b1)  bobCount++;  
        }
        if(a2>=1 && a2 <=100 && b2 >=1 && b2<=100){
        	 
            if(a2 > b2) aliceCount++;            
            if(a2< b2)  bobCount++;
        }
        
       
            
        System.out.println(aliceCount+" "+bobCount);
    }
          
        
 
}
