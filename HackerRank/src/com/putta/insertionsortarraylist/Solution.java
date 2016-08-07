package com.putta.insertionsortarraylist;
//  not working 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    ArrayList<Integer>	arrList=new ArrayList<>();
    Scanner scan= new Scanner(System.in);
           int n= scan.nextInt();
        int d= scan.nextInt();
        
        for(int i=0;i<n;i++){
        	arrList.add(new Integer(scan.nextInt()));
        }
        
        int temp=arrList.get(0).intValue();
        for(int i=0;i<d;i++){
        for(int j=0;j<n-1;j++){
        	System.out.println(j+" "+arrList.get(j).intValue()+" "+arrList.get(j+1).intValue());
        	arrList.add(j,new Integer( arrList.get(j+1).intValue()));
        	
        }
        arrList.add(arrList.size()-1, temp);
        temp=arrList.get(0).intValue();
        }
        for(int i=0;i<n;i++){
        	 System.out.print(arrList.get(i)+" ");
        }
        
    }
    
}

