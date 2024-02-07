public class Reverse {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int arr[] = { 3, 1, 1, 7, 4, 2, 6, 11 };

        int length = arr.length;
        for (int i = 0; i < length; i++) {

            if (length - i - 1 < i) {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
