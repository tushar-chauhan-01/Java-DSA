/*
Problem statement
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort 
this array/list in a 'single scan'.

'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be 
visiting each element in the array/list just once.

Note:
1. You need to change in the given array/list itself. Hence, no need to return or print anything. 
2. You are not allowed to sort the list/array directly.
 */
public class Sort012 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 0, 2 };
        sort012(arr);
        print(arr);
    }

    public static void sort012(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Handle edge case of empty array
        }

        int low = 0; // Pointer for 0s
        int high = arr.length - 1; // Pointer for 2s
        int mid = 0; // Pointer for 1s

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low++, mid++);
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high--);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int a[]) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
