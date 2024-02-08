
public class RotateAnArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = {1,2,3,4,5,6,7};

        int modified[] = new int[arr1.length];


        //rotate array by 2 to right or clockwise
        int rotate = 2, newpos;

        rotate = rotate%arr1.length;

        for (int i=0; i<arr1.length; i++){
            newpos = (i+rotate) % arr1.length ;
            modified[newpos] = arr1[i];
        }
        
        System.out.println("Rotate Clockwise");

        for(int i:modified){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Rotate Anti Clockwise");
        // rotate array by 2 to left or anticlockwise

        for (int i=0; i<arr2.length; i++){
            newpos = (arr2.length + i - rotate) % arr2.length ;
            modified[newpos] = arr1[i];
        }

        for(int i:modified){
            System.out.print(i+" ");
        }

        // optimised array rotation solution( rotate by 2 )
        System.out.println();
        System.out.println("Rotate Optimised");
        int num[] = {1,2,3,4,5,6,7};
        // step1 - reverse whole array
        int last = num.length -1;
        for (int i=0; i<num.length;i++){

            if(i>last-i){
                break;
            }
            int temp = num[i];
            num[i] = num[last-i];
            num[last-i] = temp;
        }

        System.out.println();
        for(int i:num){
            System.out.print(i+" ");
        }
        // pick starting index till rotate value for clockwise and pick from last if anticlockwise
        //Step2 - reverse sub arrays before index=rotate 
        last = rotate -1;
        for (int i=0; i<rotate;i++){

            if(i>last-i){
                break;
            }
            int temp = num[i];
            num[i] = num[last-i];
            num[last-i] = temp;
        }

        System.out.println();
        for(int i:num){
            System.out.print(i+" ");
        }
        //Step3 - reverse sub arrays after index=rotate
        last = num.length -1;
        for (int i=rotate; i<num.length;i++){

            if(i>last){
                break;
            }
            int temp = num[i];
            num[i] = num[last];
            num[last] = temp;
            last--;
        }

        System.out.println();
        for(int i:num){
            System.out.print(i+" ");
        }
        

    }
    
}
