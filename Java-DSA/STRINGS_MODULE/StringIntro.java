public class StringIntro {
    public static void main(String[] args) {
        // string internally is stored in an array format only and are immutable aka cant be changed
        // "STRING" is basically a wrapper around a character array
        String s1 = "Java";
        String s2 = "Programming";

        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());

        System.out.println(s1.charAt(2));
    }
}
