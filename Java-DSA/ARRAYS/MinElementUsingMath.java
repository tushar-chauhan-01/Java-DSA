import java.util.Scanner;

public class MinElementUsingMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element number "+ (i+1) +" in array.");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Minimum element in array is "+minimum_element(arr));
    }

    public static int minimum_element(int[] arr) {

        int minElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minElement = Math.min(minElement, arr[i]);
        }
        return minElement;
    }

}
