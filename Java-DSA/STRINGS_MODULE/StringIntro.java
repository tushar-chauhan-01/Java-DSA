
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
    }
}
