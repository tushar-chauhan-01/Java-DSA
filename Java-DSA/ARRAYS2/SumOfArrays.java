/*
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. 
Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). 
The idea here is to represent each array/list as an integer in itself of digits N and M.

You need to find the sum of both the input arrays/list treating them as two integers and put the result in 
another array/list i.e. output array/list will also contain only single digit at every index.

Note:
The sizes N and M can be different. 
*/

public class SumOfArrays {
    public static void main(String[] args) {
        int arr1[] = { 9, 9, 7, 9 };
        int arr2[] = { 2, 5, 8 };
        int sum_arr[] = sum(arr1, arr2);
        for (int i : sum_arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sum(int arr1[], int arr2[]) {
        int last;

        int arr1_len = arr1.length;
        int arr2_len = arr2.length;

        if (arr1_len > arr2_len) {
            last = arr1_len;
        } else {
            last = arr2_len;
        }

        int sum[] = new int[last+1];// plus 1 cause it is possible last digit can become >10 after addition
        int carry = 0, digit = 0;
        int last2 = arr2_len - 1;
        int last1 = arr1_len - 1;

        while (last >= 0) {

            if (last1 >= 0 && last2 >= 0) {
                System.out.println("c = "+carry+", arr1 = "+arr1[last1] +", arr2 = "+ arr2[last2]);
                digit = (arr1[last1] + arr2[last2] + carry) % 10;
                sum[last] = digit;
                carry = (arr1[last1] + arr2[last2] + carry) / 10;

            } else if (last1 >= 0 && last2 < 0) {
                System.out.println("c = "+carry+", arr1 = "+arr1[last1]);
                digit = (arr1[last1] + carry) % 10;
                sum[last] = digit;
                carry = (arr1[last1] + carry) / 10;

            } else if (last1 < 0 && last2 >= 0) {
                System.out.println("c = "+carry+", arr2 = "+ arr2[last2]);
                digit = (arr2[last2] + carry) % 10;
                sum[last] = digit;
                carry = (arr2[last2] + carry) / 10;
            }
            else if (last>=0 && last1<0 && last2<0){
                System.out.println("c = "+carry);
                sum[last] = carry;
            }

            last1--;
            last2--;
            last--;
        }

        return sum;
    }
}
