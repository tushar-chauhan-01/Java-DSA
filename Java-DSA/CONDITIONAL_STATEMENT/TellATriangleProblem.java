import java.util.Scanner;
public class TellATriangleProblem
{
	public static void main(String[] args) 
    {
		// write your code logic here !! 
		Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter 1st side");
		int a = sc.nextInt();
        System.out.println("Enter 2nd side");
		int b = sc.nextInt();
        System.out.println("Enter 3rd side");
		int c = sc.nextInt();
        sc.close();

		if (a+b > c && a+c > b && c+b > a){

			if (a == b && b == c){
				System.out.println("Equilateral Triangle");
			}
			else if ( a==b || b==c || c==a ){
				System.out.println("Isosceles Triangle");
			}
			else{
				System.out.println("Scalene Triangle");
			}
		}
		else{
			System.out.println("Not a Triangle");
		}    
	}
}

