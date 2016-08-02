/***********************************************
 * 
 * 
Context 
Given a  2D Array, :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
We define an hourglass in to be a subset of values with indices falling in this pattern in 's graphical representation:

a b c
  d
e f g
There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

Task 
Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

Input Format

There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

Constraints

Output Format

Print the largest (maximum) hourglass sum found in .

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19
Explanation

 contains the following hourglasses:

1 1 1   1 1 0   1 0 0   0 0 0
  1       0       0       0
1 1 1   1 1 0   1 0 0   0 0 0

0 1 0   1 0 0   0 0 0   0 0 0
  1       1       0       0
0 0 2   0 2 4   2 4 4   4 4 0

1 1 1   1 1 0   1 0 0   0 0 0
  0       2       4       4
0 0 0   0 0 2   0 2 0   2 0 0

0 0 2   0 2 4   2 4 4   4 4 0
  0       0       2       0
0 0 1   0 1 2   1 2 4   2 4 0
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4
 * 
https://www.hackerrank.com/challenges/2d-array
 * 
 */

import java.util.*;

public class HourGlassArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		boolean good=true;
		// using do while to make the below shuck to execute atleast once
		do{
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				int input =in.nextInt();
				if(input>=-9 && input<=9){
				arr[arr_i][arr_j] = input;
				good=true;
				}
				else{
					System.out.println("Enter valid i/p");
					good=false;
					break;
				}
				if(!good){
					break;
				}
			}
		}
		}while(!good);
		// the below array it used to hold the sum of all 16 possible hour galsses
		int sum_hourglasses[] = new int[16];
		int sumglassindex = 0;
		//hg sum stores sum for each hour glass at each iteration
		int hg_sum = 0;
		/* skip variables are used to skip the elements which doesn't belong to hour glass, we are starting from (1,0) 
		
			(0,0) (0,1) (0,2)
				   (1,1) 
			(2,0)  (2,1) (2,2)
		 * 
		 */
		int skipi = 1;
		int skipj = 0;
		// 6-2 is used for hour glass calculation till 4 section for one particular i VALUE
		for (int maini=0;maini<(6-2);maini++){
		for (int mainj = 0; mainj < (6 - 2); mainj++) {
			skipi = maini+1;
			skipj = mainj;
			for (int i = maini; i < (maini+3); i++) {
				//System.out.println("skipp this arr[" + skipi + "] [" + skipj + "]");
				for (int j = mainj; j < (mainj + 3); j++) {
					//If condition is to check the first element of an row and column which is not needed
					if (i != skipi || j != skipj) {
						//System.out.print(arr[i][j] + "(" + i + "," + j + ")" + "\t");
						// TO add the values of a particular hour glass matrix
						hg_sum = hg_sum + arr[i][j];
					}
					// If condition is to check the next element not needed in the matrix(SKIPING)
					/*ex: 00, 01,02			in the matrix we don't need 
					 *		  11 			1,0 (ABOVE) conditon is used
					 * 	  20, 21, 22		1,2(BELOW) element so the below condition is used
					 */
					if (skipj < ((3 + mainj) - 1) && i == skipi) {
						skipj = skipj + 2;
					}
				}

				System.out.println();
			}
			//System.out.println("hg_sum-" + hg_sum);
			sum_hourglasses[sumglassindex] = hg_sum;
			hg_sum = 0;
			sumglassindex++;
			//System.out.println();
			//System.out.println("---------------------------------------------------------");

		}
		}
		// sorting the elements and printing the highest element of an hour glass matrix..
		int max=sum_hourglasses[0];
		for (int i = 1; i < sum_hourglasses.length; i++) {

			if(sum_hourglasses[i]>max)
				max=sum_hourglasses[i];
			//System.out.print(sum_hourglasses[i] + "\t");
			

		}
		System.out.println(max);
	}
}