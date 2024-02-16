public class MethodInString {
    public static void main(String[] args) {
        String st = " Hello John Doe. ";

        System.out.println("length of st is -> "+ st.length());

        System.out.println("character at 2nd index is -> "+ st.charAt(2));

        System.out.println("Upper case -> "+ st.toUpperCase());

        System.out.println("Lower case -> "+ st.toLowerCase());

        System.out.println("Trim -> "+ st.trim());

        System.out.println("substring -> "+ st.substring(5) );// full string after 5th index including 5th
        System.out.println("substring -> "+ st.substring(5, 13));//end index is not included

        System.out.println(st.replace('o', '@'));

    }
}
