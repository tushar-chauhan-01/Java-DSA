import java.util.Scanner;

/*

- = space

---1
--123
-12345
1234567
---------------------------------
---*
--***
-*****
*******
---------------------------------
----1
---2-2
--3-3-3
-4-4-4-4
---------------------------------
1
21
321
4321
---------------------------------
****
-***
--**
---*
---------------------------------
1234
1--2
1--2
1234

 */
public class Pyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            // print spaces n-i times in each row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print numbers for 2i-1 in each row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 1; i <= n; i++) {
            // print spaces n-i times
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------");

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int k = 1; k <= n; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
            else{
                System.out.print(1);
                for (int j = 1; j <= n-2; j++) {
                    System.out.print(" ");
                }
                System.out.print(2);
                System.out.println();
            }
        }
        System.out.println("-------------");
    }
}
