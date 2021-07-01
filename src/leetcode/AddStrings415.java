package leetcode;

import java.math.BigInteger;

public class AddStrings415 {
    public static String addStrings(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = new BigInteger(String.valueOf(a.add(b)));
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        System.out.println(addStrings(new String("3876620623801494171"),
                new String("6529364523802684779")));
    }
}
