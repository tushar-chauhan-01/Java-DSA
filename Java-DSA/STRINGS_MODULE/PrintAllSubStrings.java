import java.util.Scanner;

public class PrintAllSubStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();


        int len = input.length();

        for( int i=0; i<len; i++ ){
            int k=i+1;
            for (int j=0; j< len-i; j++){
                System.out.print(input.substring(j, k)+"--");
                k++;
            }
            System.out.println();
        }

    }

}
