package com.hacker.algorithms.insertionsort;

import java.io.*;
import java.util.*;

public class Solution1 {

    public static void insertionSortPart2(int[] ar)
    {       int temp=0;
           for(int i=0; i<ar.length; i++){
<<<<<<< HEAD
              
                   if(ar[i]>ar[i+1]){
                	   temp=ar[i];
                       ar[i]=ar[1+1];
                       ar[i+1]=temp;
                   }
               
=======
               for(int j=i+1; j<ar.length; j++){
                   if(ar[i]>ar[j]){
                	   temp=ar[i];
                       ar[i]=ar[j];
                       ar[j]=temp;
                   }
               }
>>>>>>> branch 'master' of https://github.com/iamfool/hackerrank.git
               printArray(ar);
           }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
