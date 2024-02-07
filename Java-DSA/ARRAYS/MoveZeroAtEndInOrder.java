/*
Problem statement
Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to the end of the array 
while keeping the non-zero elements at the start of the array in their original order. Return the modified array.

Example :
Input: ‘n’ = 5, ‘arr’ = [1, 2, 0, 0, 2, 3]
Output: [1, 2, 2, 3, 0, 0]

Explanation: Moved all the 0’s to the end of an array, and the rest of the elements retain the order at the start.


optimized array->
1. take 2 pointers nz and z
2 if nz finds non zero element move fwd else do nothing
3. if z find zero then move fwd else swap element z with nz and move nz fwd and fwd z
*/
public class MoveZeroAtEndInOrder {
    public static void main_unoptimized(String[] args) {
        int arr[] = { 1, 2, 0, 0, 3, 0, 4, 0, 98, 0, 1 };
        int n = arr.length;

        int b[] = new int[n];
        int l = n - 1, s = 0;

        for (int i : arr) {
            if (i == 0) {
                b[l] = 0;
                l--;
            } else {
                b[s] = i;
                s++;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:b){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 0, 3, 0, 4, 0, 98, 0, 1 };
        int n = arr.length;
        int nz = 0, z = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                z++;
            } else {
                int temp = arr[z];
                arr[z]=arr[nz];
                arr[nz]=temp;
                z++;
                nz++;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
