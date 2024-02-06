/*
 Problem statement
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.

 Note:
Unique element is always present in the array/list according to the given condition.
 */

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element - ");
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(unique(arr));
    }

    public static int unique(int arr[]) {
        int count, uniqueInt = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            count = 0;

            for (int j : arr) {
                if (j == arr[i]) {
                    count=count+1;
                }
            }
            if (count == 1) {
                uniqueInt = arr[i];
                break;
            }
        }
        return uniqueInt;
    }
}
