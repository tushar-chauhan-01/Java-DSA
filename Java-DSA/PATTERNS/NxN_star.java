/*

###
###
###
-----------------------
111
222
333
-----------------------
123
123
123
-----------------------
321
321
321
-----------------------
1 2 3 
2 3 1
3 1 2

*/

import java.util.Scanner;

public class NxN_star {
	public static void main(String args[]) {

		System.out.println("PLEASE ENTER VALUE OF 'N' --> ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("-----------------------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}
		System.out.println("-----------------------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}
		System.out.println("-----------------------");

		for (int i = n; i > 0; i--) {
			for (int j = n; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-----------------------");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j+" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k+" ");
			}

			System.out.println();
		}
		System.out.println("-----------------------");

	}
}