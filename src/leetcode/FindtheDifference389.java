package leetcode;

public class FindtheDifference389 {
    public static char findTheDifference(String s, String t) {
        int oneWord = 0;
        int twoWord = 0;
        for (int i = 0; i < s.length(); i++) {
            oneWord +=s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            twoWord +=t.charAt(i);
        }
        return (char) (twoWord-oneWord);
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("", "y"));
        System.out.println(findTheDifference("a", "aa"));
        System.out.println(findTheDifference("ae", "aea"));
    }
}
