/*
Q1
*
**
***
****
-------------
Q2
1
12
123
1234
-------------
Q3
1
23
456
78910
-------------
Q4
1
23
345
4567
-------------
Q5
1
22
333
4444
-------------
Q6
4
43
432
4321
-------------
Q7
****
***
**
*
-------------
Q8
4444
333
22
1
-------------
Q9
---1
--22
-333
4444
-------------
Q10
---*
--**
-***
****
-------------

 */
import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
		
		// Q1
        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print("*");
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q2
        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print(j);
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q3
        int num = 1;
        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print(num);
                num=num+1;
			}
			System.out.println(); 
		}
        System.out.println("-------------");

        // Q4
        for ( int i=1; i<=n; i++ ){
            int num2 = i;
			for ( int j=1; j<=i; j++ ){
				System.out.print(num2);
                num2=num2+1;
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q5
        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print(i);
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q6
        for ( int i=1; i<=n; i++ ){
            int num2 = n;
			for ( int j=1; j<=i; j++ ){
				System.out.print(num2);
                num2=num2-1;
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q7
        for ( int i=1; i<=n; i++ ){
			for ( int j=n; j>=i ; j-- ){
				System.out.print("*");
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q8
        for ( int i=n; i>=1; i-- ){
			for ( int j=1; j<=i ; j++ ){
				System.out.print(i);
			}
			System.out.println(); 
		}
        System.out.println("-------------");
		
		// Q9
        for ( int i=1; i<=n; i++ ){
			for ( int j=n-i; j>0 ; j-- ){
				System.out.print("-");
			}
			for ( int k=i; k>0 ; k-- ){
				System.out.print(i);
			}
			System.out.println(); 
		}
        System.out.println("-------------");

		// Q10
        for ( int i=1; i<=n; i++ ){
			for ( int j=n-i; j>0 ; j-- ){
				System.out.print("-");
			}
			for ( int k=i; k>0 ; k-- ){
				System.out.print("*");
			}
			System.out.println(); 
		}
        System.out.println("-------------");
    
    }
}
