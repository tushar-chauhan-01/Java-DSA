import java.util.Scanner;

/*

- = space

Q1
---1
--123
-12345
1234567
---------------------------------
Q2
---*
--***
-*****
*******
---------------------------------
Q3
----1
---2-2
--3-3-3
-4-4-4-4
---------------------------------
Q4
1
21
321
4321
---------------------------------
Q5
****
-***
--**
---*
---------------------------------
Q6
1234
1--2
1--2
1234
---------------------------------
Q7
---1
--232
-34543
4567654
---------------------------------
Q8
---*
--***
-*****
*******
-*****
--***
---*
---------------------------------
Q9 (odd numbers only )
--*
-***
*****
-***
--*
---------------------------------
Q10
4-3-2-1
3-2-1
2-1
1
2-1
3-2-1
4-3-2-1 
---------------------------------
 */
public class Pyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Q1
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
        System.out.println("---------------------------------");

        // Q2
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
        System.out.println("---------------------------------");

        // Q3
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
        System.out.println("---------------------------------");

        // Q4
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        // Q5
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        // Q6
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int k = 1; k <= n; k++) {
                    System.out.print(k);
                }
                System.out.println();
            } else {
                System.out.print(1);
                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(2);
                System.out.println();
            }
        }
        System.out.println("---------------------------------");

        // Q7
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print("-");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print(i+j);
            }
            for (int l = i-2; l >= 0 ; l--) {
                System.out.print(i+l);
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        // Q8
        for (int i = 1; i <= n; i++) {
            // print spaces n-i times
            for (int j = 1; j <= n - i; j++) {
                System.out.print("-");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
      
        for (int i = n-1; i > 0; i--) {
            for (int j = n ; j > i ; j --) {
                System.out.print("-");
            }
            for (int k = 0; k < 2*i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    
        // Q9
        int middle = (n+1)/2 ;
        for (int i = 1; i <= middle; i++) {

            for (int j = i; j < middle ; j++){
                System.out.print("-");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = middle-1  ; i > 0 ; i--) {
            for (int j = 1 ; j < middle-i+1 ; j ++) {
                System.out.print("-");
            }
            for (int k = 1 ; k <= 2*i - 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        // Q10
        for (int i = 0; i < n; i++) {
            // print spaces n-i times
            for (int j = n-i; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
      
        for (int i = 1; i <= n-1 ; i++) {
            for (int j = i+1 ; j >0 ; j --) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }
}