import java.util.*;

public class HourGlassArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		int sum_hourglasses[] = new int[16];
		int hg_sum = 0;
		int skipi = 1;
		int skipj = 0;
		int sumglassindex = 0;
		for (int maini=0;maini<(6-2);maini++){
		for (int mainj = 0; mainj < (6 - 2); mainj++) {
			skipi = 1;
			skipj = mainj;
			for (int i = 0; i < 3; i++) {
				System.out.println("skipp this arr[" + skipi + "] [" + skipj + "]");
				for (int j = mainj; j < (mainj + 3); j++) {

					if (i != skipi || j != skipj) {
						System.out.print(arr[i][j] + "(" + i + "," + j + ")" + "\t");
						hg_sum = hg_sum + arr[i][j];
					}
					if (skipj < ((3 + mainj) - 1) && i == (3 - (3 - 1))) {
						skipj = skipj + 2;
					}
				}

				System.out.println();
			}
			System.out.println("hg_sum-" + hg_sum);
			sum_hourglasses[sumglassindex] = hg_sum;
			hg_sum = 0;
			sumglassindex++;
			System.out.println();
			System.out.println("---------------------------------------------------------");

		}
		}
		for (int i = 0; i < sum_hourglasses.length; i++) {

			System.out.print(sum_hourglasses[i] + "\t");

		}
	}
}
