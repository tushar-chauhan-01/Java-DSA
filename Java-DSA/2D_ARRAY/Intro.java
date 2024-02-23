public class Intro {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];
        int []arr2[]= new int[3][4];
        int [][] arr3 = new int[3][4];
        int arr4[][] = {{1,2,3,12},{4,5,6,11},{7,8,9,10}};

        // checking type of variable
        System.out.println(arr.getClass().getName()); // [[I
        System.out.println(arr[0].getClass().getName()); // [I
        System.out.println(arr2.getClass().getName());// [[I
        System.out.println(arr3.getClass().getName());// [[I

        // printing values
        System.out.println(arr4);// [[I@4617c264
        System.out.println(arr4[0]);// [I@36baf30c
        System.out.println(arr4[0][1]);// 2
        // System.out.println(arr4[0][15]);// index out of bound


        int arr5[][] = new int[4][];
        System.out.println(arr5);// [[I@7a81197d
        System.out.println(arr5[0]);// null
        System.out.println(arr5[0][1]);// NullPointerException

    }
}
