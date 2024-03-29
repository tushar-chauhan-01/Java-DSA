
public class RotateAnArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 1, 2, 3, 4, 5, 6, 7 };

        int modified[] = new int[arr1.length];

        // rotate array by 2 to right or clockwise
        int rotate = 2, newpos;

        rotate = rotate % arr1.length;

        for (int i = 0; i < arr1.length; i++) {
            newpos = (i + rotate) % arr1.length;
            modified[newpos] = arr1[i];
        }

        System.out.println("Rotate Clockwise");

        for (int i : modified) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Rotate Anti Clockwise");
        // rotate array by 2 to left or anticlockwise

        for (int i = 0; i < arr2.length; i++) {
            newpos = (arr2.length + i - rotate) % arr2.length;
            modified[newpos] = arr1[i];
        }

        for (int i : modified) {
            System.out.print(i + " ");
        }

        /////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////

        // optimised array rotation solution( rotate by 2 )
        System.out.println();
        System.out.println("Rotate Optimised");
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        int num_arr[] = optimised(num, 2, -1);
        System.out.println();
        for (int i : num_arr) {
            System.out.print(i + " ");
        }

    }

    public static int[] optimised(int num[], int rotate, int direction) {
        rotate = rotate % num.length;
        // step1 - reverse whole array
        int last = num.length - 1;

        for (int i = 0; i < num.length; i++) {

            if (i > last - i) {
                break;
            }
            int temp = num[i];
            num[i] = num[last - i];
            num[last - i] = temp;
        }

        // pick starting index till rotate value for clockwise and pick from last if
        // anticlockwise

        // Step2 - reverse sub arrays before index=rotate
        if (direction > 0) {
            for (int i = 0; i < rotate - 1; i++) {
                if (i >= rotate - i) {
                    break;
                }
                int temp = num[i];
                num[i] = num[rotate - 1 - i];
                num[rotate - 1 - i] = temp;
            }

            // Step3 - reverse sub arrays after index=rotate
            for (int i = rotate; i < num.length; i++) {

                if (i > last) {
                    break;
                }
                int temp = num[i];
                num[i] = num[last];
                num[last] = temp;
                last--;
            }
        } else {
            for (int i = 0; i < last - rotate; i++) {

                if (i > last - rotate - i) {
                    break;
                }
                int temp = num[i];
                num[i] = num[last - rotate - i];
                num[last - rotate - i] = temp;
            }
            // // Step3 - reverse sub arrays after index=rotate
            for (int i = num.length - rotate; i < num.length; i++) {
                if (i > last) {
                    break;
                }
                int temp = num[i];
                num[i] = num[last];
                num[last] = temp;
                last--;
            }
        }

        return num;
    }

}
