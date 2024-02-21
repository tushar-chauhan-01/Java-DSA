public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aabccdaa";
        StringBuffer s = new StringBuffer("");

        s.append(str.charAt(0));

        int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != s.charAt(j)) {
				s.append(str.charAt(i));
				j = j + 1;
			}
		}
		System.out.println(s.toString());

    }
}
