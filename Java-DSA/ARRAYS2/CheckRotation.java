public class CheckRotation {

    public static void main(String[] args) {
        int arr[] = { 12, 13, 17, 1, 2, 6, 9 };
        System.out.println(check(arr));

    }

    public static int check(int arr[]) {

        int last = arr.length-1;
        int rotate = 1, rotation=0;

        while (rotation < arr.length) {

            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();

            if (arr[0] == 1) {
                break;
            }
            for (int i = 0; i < arr.length; i++) {

                if (i > last - i) {
                    break;
                }
                int temp = arr[i];
                arr[i] = arr[last - i];
                arr[last - i] = temp;
            }

            for (int i = 0; i < last - rotate; i++) {

                if (i > last - rotate - i) {
                    break;
                }
                int temp = arr[i];
                arr[i] = arr[last - rotate - i];
                arr[last - rotate - i] = temp;
            }
            // Step3 - reverse sub arrays after index=rotate
            for (int i = arr.length - rotate; i < arr.length; i++) {
                if (i > last) {
                    break;
                }
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
                last--;
            }

            rotation++;
        }

        return rotation;
    }
}
