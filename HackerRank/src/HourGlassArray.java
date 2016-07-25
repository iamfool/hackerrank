	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class HourGlassArray {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[3][3];
	        for(int arr_i=0; arr_i < 3; arr_i++){
	            for(int arr_j=0; arr_j < 3; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	        int sum_hourglasses[] = new int[16];
	        int hg_sum=0;
	        int skipi=1;
	        int skipj=0;
	        for (int i=0;i<3;i++){
	        	System.out.println("skipp this arr["+skipi +"] ["+skipj+"]");
	        	for(int j=0;j<3;j++){
	        		
	        		if(i!=skipi || j!=skipj){
	        			System.out.print(arr[i][j]+"("+i+","+j+")"+"\t");
	        			hg_sum=hg_sum+arr[i][j];
	        		}
	        		if(skipj<(3-1)&& i==(3-(3-1))){
			        	skipj=skipj+2;
			        	}
	        	}
	        	
	        	System.out.println();
	        }
	        System.out.println("hg_sum-"+hg_sum);
	    }
	}
	
	
	
	