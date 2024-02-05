import java.util.Scanner;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element number " + (i + 1) + " in array.");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Total is " + sum(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i:arr) {
            sum = sum + i;
        }
        return sum;
    }

}
