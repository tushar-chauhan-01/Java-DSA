public class FixMaxOccuredChar {
    public static void main(String[] args) {
        String str = "abababssjfinabdjfieajaaadbfjowqabfmowfocjcedowsjlfapad";
        System.out.println(highestOccurringCharacter(str));
    }

    public static char highestOccurringCharacter(String s) {
        // Initialize an array to store the count of each character (assuming only
        // lowercase letters)
        int[] counts = new int[26];

        // Iterate through the string and count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counts[ch - 'a'] = counts[ch - 'a'] + 1;
        }

        // Find the character with the highest occurrence
        char highestChar = 'a';
        int highestCount = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > highestCount) {
                highestCount = counts[i];
                highestChar = (char) ('a' + i);
            }
        }

        System.out.println(highestChar+ " have max count of "+highestCount );
        return highestChar;
    }
}
