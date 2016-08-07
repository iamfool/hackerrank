package com.hacker.array.dynamicarray;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     

Scanner sc = new Scanner(System.in);

    int  n = sc.nextInt();
    int  q = sc.nextInt();
   
    int  last = 0;
    int  product;
    int   a[][] = new int [ q][3];
    int  s[][] = new int [ q][1000000];
    int index[]=new int[ q];
    
    for (int i=0;i<q;i++)
    	index[i]=0;
    for(int i = 0; i<q ; i++)
    {
        for(int j=0;j<3;j++)
        a[i][j] = sc.nextInt();
       product=((a[i][1]^last)%n);
        if(a[i][0] == 1)                  
        {
           
            
        	s[(int) product] [ index[ product]] = a[i][2];
            index[(int) product]++;
        }
        else{

              
          last= s[(int) product] [ (a[i][2]%index[ product])] ;

                System.out.println(last);


        }


    
    }
    }
    
}