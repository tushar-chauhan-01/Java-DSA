import java.util.Scanner;

/*
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding 
Celsius values and print the table.
Hint : Use type casting

 */

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		int s = sc.nextInt(), e = sc.nextInt(), w = sc.nextInt() ;
		double celsius ;
        sc.close();

		for (int i =s; i <= e ; i=i+w){
			celsius =  (i-32) * (5.0/9.0);

			System.out.print(i+"f = "+ (int) celsius+"c");
            System.out.println();

		}

    }
}
