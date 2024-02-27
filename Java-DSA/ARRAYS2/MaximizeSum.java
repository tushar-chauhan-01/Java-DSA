/*
Problem statement
Given 2 sorted arrays (in increasing order), find a path through the intersections that produces maximum 
sum and return the maximum sum.

That is, we can switch from one array to another array only at common elements.

If no intersection element is present, we need to take sum of all elements from the array with greater sum.

Sample Input :
6
1 5 10 15 20 25
5
2 4 5 9 15
Sample Output :
81
Explanation :
We start from array 2 and take sum till 5 (sum = 11). Then we'll switch to array at element 10 and take till 15. 
So sum = 36. Now, no elements left in array after 15, so we'll continue in array 1. Hence sum is 81
 */
public class MaximizeSum {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 10, 15, 20, 25 };
        int arr2[] = { 2, 4, 5, 9, 15 };
        System.out.println(maximumSumPath(arr1, arr2));
    }

    public static long maximumSumPath(int[] input1, int[] input2) {
        int m = input1.length;
        int n = input2.length;

        int i = 0, j = 0;
        long sum1 = 0, sum2 = 0, result = 0;

        while (i < m && j < n) {
            if (input1[i] < input2[j]) {
                sum1 += input1[i++];
            } else if (input1[i] > input2[j]) {
                sum2 += input2[j++];
            } else {
                // Found an intersection
                result += Math.max(sum1, sum2) + input1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements from input1
        while (i < m) {
            sum1 += input1[i++];
        }

        // Add remaining elements from input2
        while (j < n) {
            sum2 += input2[j++];
        }

        // Add the maximum of remaining sums
        result += Math.max(sum1, sum2);

        return result;
    }

}
