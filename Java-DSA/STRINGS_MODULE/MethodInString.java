public class MethodInString {
    public static void main(String[] args) {
        String st = " Hello John Doe. ";

        System.out.println("length of st is -> "+ st.length());// length of string

        System.out.println("character at 2nd index is -> "+ st.charAt(2));// gives back value of character at index 2

        System.out.println("Upper case -> "+ st.toUpperCase());// upper case

        System.out.println("Lower case -> "+ st.toLowerCase());// lower case

        System.out.println("Trim -> "+ st.trim());// trim spaces from beginning and last

        System.out.println("substring -> "+ st.substring(5) );// full string after 5th index including 5th
        
        System.out.println("substring -> "+ st.substring(5, 13));//end index is not included

        System.out.println(st.replace('o', '@'));// replace characters/words in string

        System.out.println(st.indexOf('o'));// give first index appreance of provided letter from beginning
        
        System.out.println(st.indexOf('i'));// give -1 if valur cant be found
        
        System.out.println(st.indexOf('o', 7));
        
        System.out.println(st.lastIndexOf('o')); // give last index appreance of provided letter from beginning

        String st1 = "Hello";
        String st2 = "Hello";
        System.out.println(st1.equals(st2));// returns true false based on comparasion of 2 string value

        System.out.println(st1.compareTo(st2)); // gives ascii difference of letter or whole word 
        // compareTo find difference on 2nd index it will simply return ascii difference of those 2 letter
        // if both string are same in start but different length at end it will give length difference
       


    }
}
