public class ReturnArray {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 5, 6, 7 };
        
        for(int i:A){
            System.out.print(i+" ");
        }
        A = increment(A);
        System.out.println();
        for(int i:A){
            System.out.print(i+" ");
        }

    }

    public static int[] increment(int A[]) {

        int B[] = new int[7];
        for (int i = 0; i < B.length; i++) {
            B[i] = B[i] + 2;
        }
        return B;
    }

}
