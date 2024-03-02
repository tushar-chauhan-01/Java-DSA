import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Enter number you want to find - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

        int result = Bsearch(arr, num);
        if (result != 1) {
            System.out.println("Your number dont exist in array.");
        } else {
            System.out.println("Your number exist in array.");
        }
    }

    public static int Bsearch(int arr[], int num) {

        int l = 0, r = arr.length - 1;
        while (r >= l && l >= 0 && r >= 0) {

            int m = (l + r) / 2;
            System.out.println(arr[l] + " " + arr[m] + " " + arr[r]);
            if (arr[m] == num || arr[l] == num || arr[r] == num) {
                return 1;
            } else if (arr[m] > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
