public class MaxNumberInArray {
    public static void main(String[] args) {
        int Arr[] = {2,4,5,6,7,43,24,532,64,78,33,0};

        int max1 = Arr[0];
        int max2 = Arr[0];

        for (int i:Arr){
            System.out.println("i is "+i+" , max1 is "+max1+" , max2 is "+max2);
            if (i>max1){
                max2= max1;
                max1 = i;
            }
            else if (i<max1 && i>max2){
                max2 = i;
            }
            
        }
        System.out.println(max2);
    }
}
