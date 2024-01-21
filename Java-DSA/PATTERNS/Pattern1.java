/*
1
01
101
0101
10101 

432*
43*1
4*21
*321

*/

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int N = 5, start = 1;
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i=1 ; i<=n ; i++){
			for(int j=n; j>0;j--){
				if (j==i){
					System.out.print("*");
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
    
    }
}
