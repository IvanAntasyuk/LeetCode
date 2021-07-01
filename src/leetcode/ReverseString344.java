package leetcode;

import java.util.Arrays;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s).reverse();
        sb.getChars(0, sb.length(), s, 0);
        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
        char[] ch = new char[4];
        ch[0] = 'h';
        ch[1] = 'e';
        ch[2] = 'l';
        ch[3] = 'l';
        reverseString(ch);
    }
}
