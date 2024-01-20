import java.util.Scanner;

/*

Q1
1-2-3-4-5
-2-3-4-5
--3-4-5
---4-5
----5
---4-5
--3-4-5
-2-3-4-5
1-2-3-4-5

----------------------------
 */
public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i=1 ; i<= n ; i++){
            for (int j=i-1 ; j>0 ; j--){
                System.out.print("-");
            }
            for (int k=i ; k<=n  ; k++){
                System.out.print(k);
                if (k != n){
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        for (int i=n-1 ; i>0 ; i--){
            for (int j=i-1 ; j>0 ; j--){
                System.out.print("-");
            }
            for (int k=i ; k<=n  ; k++){
                System.out.print(k);
                if (k != n){
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}
