import java.util.Scanner;

/*
Q1
ABCD
ABCD
ABCD
ABCD
------------------------------ 
Q2
AAAA
BBBB
CCCC
DDDD
------------------------------
Q3
ABCD
BCDE
CDEF
DEFG
------------------------------
Q4
D
CD
BCD
ABCD
------------------------------



 */
public class Patterns1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("------------------------------");
        
        // Q1
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
        System.out.println("------------------------------");

        // Q2
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char) ('A' + i));
			}
			System.out.println();
		}
        System.out.println("------------------------------");

        // Q3
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((char) ('A' + i + j));
			}
			System.out.println();
		}
        System.out.println("------------------------------");
        
        // Q4
        for (int i = n; i > 0; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print((char) ('A' + j - 1));
			}
			System.out.println();
		}
        System.out.println("------------------------------");

    }
}
