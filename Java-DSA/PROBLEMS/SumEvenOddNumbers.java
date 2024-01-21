import java.util.Scanner;
/*
n= 1234
even sum 6,  odd sum 4

 */
public class SumEvenOddNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int even=0, odd=0, val;
		while(n/10 > 0){
			val = n%10;
			if (val%2 == 0){
				even = even+val;
			}
			else{
				odd=odd+val;
			}

			n=n/10;
			if (0<n && n<10){
				if (n%2 == 0){
					even = even+n;
				}
				else{
					odd=odd+n;
				}
			}
		}
		System.out.println(even+" "+odd);
    }
}
