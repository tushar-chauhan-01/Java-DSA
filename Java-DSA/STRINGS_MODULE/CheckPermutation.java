/*
 Problem statement
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.

Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged 
so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given 
strings are a permutation of each other.

(ASSUMING ONLY CAPITAL LETTER ARE THERE)
 */
public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "strING";
        String str2 = "stRIgn";

        System.out.println(str1 +" is permutation of "+ str2 +" - "+ isPermutation(str1,str2));
    }

    public static boolean isPermutation(String s1, String s2) {

        String S1 = s1.toUpperCase();
        String S2 = s2.toUpperCase();

        if( S1.length()!=S2.length()){
            return false;
        }

        int count[] = new int[26];

        for(int i=0; i<S1.length(); i++){
            count[S1.charAt(i) - 'A'] = count[S1.charAt(i) - 'A'] + 1;
            count[S2.charAt(i) - 'A'] = count[S2.charAt(i) - 'A'] - 1;
        }

        for(int i=0; i< count.length; i++){
            if(count[i]!=0){
                return false;
            }
        }

        return true;
    }

}
