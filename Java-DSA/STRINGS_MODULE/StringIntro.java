import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        // string internally is stored in an array format only and are immutable aka cant be changed
        
        // "STRING" is basically a wrapper around a character array

        // direct assignment
        String s1 = "Java";
        String s2 = "Programming";

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.charAt(2));

        // Passing string literal
        String s3 = new String("Coding");
        System.out.println(s3);

        // Passing charachter array
        char lst[] = {'a','b','c','d','e','f','g'};
        System.out.println(lst);

        // Passing byte array
        char lst1[] = {97,98,99,100,101};
        System.out.println(lst1);

        //// User Runtime Input
        Scanner sc = new Scanner(System.in);

        // ALL WORDS IN SENTENCES ARE TOKEN AND ALL SPACES ARE CALLED DELIMITER."ENTER OR \N IS ALSO A DELIMITER."
        //nextline - SEARCHES FOR \N OR ENTER AND THEN STOP INPUT
        String input = sc.nextLine();//John Doe
        System.out.println(input);//John Doe

        //next - SEARCES FOR BLANK SPACE OR \N AKA NEXT LINE AND THEN STOPS INPUT
        String input1 = sc.next();// John Doe
        System.out.println(input1);//John

        sc.close();
    }
}