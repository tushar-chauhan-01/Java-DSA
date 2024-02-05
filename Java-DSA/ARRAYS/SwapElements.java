/* 
You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the 
array/list.
*/
public class SwapElements {
    public static void main(String[] args) {
        int Arr[] = { 2, 4, 5, 6, 7, 43, 24, 532, 64, 78, 33, 0 };

        if (Arr.length == 0) {
            return;
        }

        for (int i : Arr) {
            System.out.print(i + " ");
        }

        int val;
        System.out.println();
        for (int i = 0; i < Arr.length; i = i + 2) {
            if (i + 1 >= Arr.length) {
                break;
            }

            val = Arr[i + 1];
            Arr[i + 1] = Arr[i];
            Arr[i] = val;
        }

        for (int i : Arr) {
            System.out.print(i + " ");
        }

    }

}
