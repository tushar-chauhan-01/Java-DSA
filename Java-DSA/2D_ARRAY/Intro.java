public class Intro {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][4];
        int []arr2[]= new int[3][4];
        int [][] arr3 = new int[3][4];

        // checking type of variable
        System.out.println(arr.getClass().getName()); // [[I
        System.out.println(arr2.getClass().getName());// [[I
        System.out.println(arr3.getClass().getName());// [[I
    }
}
