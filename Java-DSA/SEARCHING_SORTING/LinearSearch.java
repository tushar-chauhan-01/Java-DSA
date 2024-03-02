import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        System.out.println("Enter number you want to find - ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int result = Lsearch(arr, num);
        if (result != 1) {
            System.out.println("Your number dont exist in array.");
        } else {
            System.out.println("Your number exist in array.");
        }
    }

    public static int Lsearch(int arr[], int num) {
        for (int element : arr) {
            if (element == num) {
                return 1;
            }
        }
        return -1;
    }
}
