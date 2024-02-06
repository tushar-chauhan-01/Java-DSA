/*
Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. 
You need to print their intersection; An intersection for this problem can be defined when both the 
arrays/lists contain a particular value or to put it in other words, when there is a common value that 
exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first array/list(ARR1)
use case--
2
10 10
1
10
*/
public class FindIntersection {
    public static void main(String[] args) {
        int arr1[] = {10,10,3,4,5,5,6};
        int arr2[] = {10,3,6,5};
        intersection(arr1, arr2);
        
    }

    public static void intersection(int arr1[], int arr2[]) {
        for (int i : arr1) {
            for (int j =0; j<arr2.length; j++) {
                if (i == arr2[j]) {
                    System.out.print(i + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }

            }
        }

    }
    
}
