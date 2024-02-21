public class RemoveOccuranceOfMatchingChar {
    public static void main(String[] args) {

        String str = "Hexllxo Woxrlxxxd";
        char ch = 'x';

        StringBuilder s = new StringBuilder(str);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                s.deleteCharAt(i);
                i = i - 1;
            }

        }
        System.out.println(s.toString());
    }
}
