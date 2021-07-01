package leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int K) {
        String arrNum = "";
        for (int i = 0; i < num.length; i++) {
            arrNum += num[i];
        }
        BigInteger sum = new BigInteger(arrNum);
        sum = sum.add(BigInteger.valueOf(K));
        String str = sum.toString();
        List<Integer> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(Character.getNumericValue(c));
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }
}
