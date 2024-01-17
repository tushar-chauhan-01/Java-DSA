/*
*
**
***
****
-------------
1
12
123
1234
-------------
1
23
456
78910
-------------
1
23
345
4567
-------------
1
22
333
4444
-------------

4
43
432
4321
-------------
 */
import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print("*");
			}
			System.out.println(); 
		}
        System.out.println("-------------");

        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print(j);
			}
			System.out.println(); 
		}
        System.out.println("-------------");

        int num = 1;
        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print(num);
                num=num+1;
			}
			System.out.println(); 
		}
        System.out.println("-------------");

       
        for ( int i=1; i<=n; i++ ){
            int num2 = i;
			for ( int j=1; j<=i; j++ ){
				System.out.print(num2);
                num2=num2+1;
			}
			System.out.println(); 
		}
        System.out.println("-------------");

        for ( int i=1; i<=n; i++ ){
			for ( int j=1; j<=i; j++ ){
				System.out.print(i);
			}
			System.out.println(); 
		}
        System.out.println("-------------");

        for ( int i=1; i<=n; i++ ){
            int num2 = n;
			for ( int j=1; j<=i; j++ ){
				System.out.print(num2);
                num2=num2-1;
			}
			System.out.println(); 
		}
        System.out.println("-------------");
    }
}
