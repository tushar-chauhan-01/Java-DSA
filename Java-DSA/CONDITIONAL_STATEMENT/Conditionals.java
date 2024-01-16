import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number --> ");
        int num = sc.nextInt();
        sc.close();
        // If else statement
        if (num % 2 == 0){
            System.out.println("Its an even number.");
        }
        else{
            System.out.println("Its an odd number.");
        }

        // if else if statement
        if ( num > 90 ){
            System.out.println("Your grade is A.");
        }
        else if (  num > 70 && num <= 90 ){
            System.out.println("Your grade is B.");
        }
        else {
            System.out.println("You failed.");
        }

        // Ternary Operator
        int val = num > 90 ? num : 90 ;
        System.out.println(val);
        
    }
}
