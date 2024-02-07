import java.util.Scanner;

public class UpdatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What value do you want to update.");
        int up_val = sc.nextInt();
        System.out.println("Enter Value with which you want to update.");
        int in_val = sc.nextInt();
        sc.close();


        int arr[]={1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<arr.length; i++){
            if (arr[i]== up_val){
                arr[i] = in_val;
                break;
            }
        }

        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
