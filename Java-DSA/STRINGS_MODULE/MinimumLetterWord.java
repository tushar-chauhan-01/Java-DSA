/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.

Note : If multiple words are of same length, then answer will be first minimum length word in the string. 
Words are seperated by single space only.
 */
public class MinimumLetterWord {
    public static void main(String[] args) {
        String s = "Hello my name is john doe";
        System.out.println(minLengthWord(s));
    }

    public static String minLengthWord(String input) {

        String arr[] = input.split(" ");

        String pointer = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < pointer.length()) {
                pointer = arr[i];
            }
        }

        return pointer;
    }
}
