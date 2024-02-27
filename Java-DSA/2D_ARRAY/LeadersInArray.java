/*
Problem statement
Given an integer array A of size n. Find and print all the leaders present in the input array. 
An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less 
than or equal to A[i].

Print all the leader elements separated by space and in the reverse order. That means whichever leader comes 
at last should be printed first.
*/
public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 342, 5, 6, 7, 8, 9, 101, 6, 4, 34, 54, 4, 4, 56, 66, 7, 0, 9 };
        leaders(arr);
    }

    public static void leaders(int[] input) {
        if (input == null || input.length == 0) {
            return;
        }

        int n = input.length;
        int maxRight = input[n - 1];
        System.out.print(maxRight + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (input[i] >= maxRight) {
                maxRight = input[i];
                System.out.print(maxRight + " ");
            }
        }
    }

}
