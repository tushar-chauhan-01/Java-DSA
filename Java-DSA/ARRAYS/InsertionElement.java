import java.util.Scanner;

public class InsertionElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("At what position do you want element to be inserter( position is index+1 )");
        int pos = sc.nextInt();
        System.out.println("Enter Value to be inserter");
        int val = sc.nextInt();
        sc.close();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (pos > arr.length) {
            System.out.println("Position must be less than length of an array.");
        }

        for (int i = arr.length - 1; i >= pos - 1; i--) {
            if (arr[i] != 0) {
                arr[i + 1] = arr[i];
            }
        }
        arr[pos - 1] = val;

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
