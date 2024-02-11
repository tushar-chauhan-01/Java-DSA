public class ArrangeNumber {
    public static void main(String[] args) {
        int n=11;
        int arr[] = new int[n];
        // output = { 1,3,5,6,4,2}

        for( int i=0; i<n;  i++){
            if(i>n-1-i){
                break;
            }
            arr[i] = (2*i) + 1 ;
            if (i!= n-1-i){
                arr[n-1-i] = 2*(i+1);
            }
            
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
