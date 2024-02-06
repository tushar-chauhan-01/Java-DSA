/*
 You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1.
  Write a function to sort this array/list. 
  Think of a solution which scans the array/list only once and don't require use of an extra array/list.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
 */

public class Sort_0_And_1 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1 };
        sort_01(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sort_01(int arr[]) {
        if (arr.length == 0) {
            return;
        }

        int moveZeroHere = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i]==0){
                int temp = arr[moveZeroHere];
                arr[moveZeroHere] = 0;
                arr[i] = temp;
                moveZeroHere = moveZeroHere+1;
            }
            
        }

    }
}
