/*
 Problem statement
Write a program to do basic string compression. For a character which is consecutively repeated more than once, 
replace consecutive duplicate occurrences with the count of repetitions.

Example:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note:
Consecutive count of every character in the input string is less than or equal to 9. You are not required 
to print anything. It has already been taken care of. Just implement the given function and return the 
compressed string.
 */

import java.util.Scanner;

public class CompressString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String input = sc.nextLine();
        sc.close();
        System.out.println(getCompressedString(input));
    }

    public static String getCompressedString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        int count = 1;
        StringBuffer s = new StringBuffer();

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    s.append(str.charAt(i)).append(count);
                } else {
                    s.append(str.charAt(i));
                }
                count = 1;
            }
        }
        // For last character
        if (count > 1) {
            s.append(str.charAt(str.length() - 1)).append(count);
        } else {
            s.append(str.charAt(str.length() - 1));
        }

        return s.toString();
    }
}
