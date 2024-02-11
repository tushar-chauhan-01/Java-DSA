public class TrippletOfSum {
    public static void main(String[] args) {
        int arr[] = { 2, -5, 8, -6, 0, 5, 10, 11, -3 };
        int match = 10;

        int len = arr.length, count = 0;

        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len ; k++) {
                    if (arr[i] + arr[j] + arr[k] == match) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
