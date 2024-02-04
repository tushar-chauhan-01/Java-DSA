public class Array {
    public static void main(String[] args) {
        System.out.println("Arrays in JAVA");

        int arr[] = new int[5];
        int[] arr1 = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr1[1]);
        arr1[1]=12;
        System.out.println(arr1[1]);

        //////////
        int arr2[] = {2,3,5,6,8,45,366,363,2,26,24};
        for (int i=0; i< arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    }
}
