package leetcode;

public class LengthofLastWord58 {
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0 || s.replace(" ","").equals("") ) return 0;
        String[] arrS = s.split(" ");
        return arrS[arrS.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("Hello World Java"));
        System.out.println(lengthOfLastWord("               "));
    }
}
