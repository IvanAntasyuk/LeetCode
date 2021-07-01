package leetcode;

import java.util.Arrays;

public class PlusOne66 {
    public static int[] plusOne(int[] digits) {
//        if (digits.length == 0) digits[0] = +1;
//        digits[digits.length - 1] = digits[digits.length-1]+1;
//        return digits;
        final int len = digits.length;
        for(int i = len - 1; i >= 0; --i){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        final int[] result = new int[len + 1];
        result[0] = 1;
        return result;


    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
//        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
//        System.out.println(Arrays.toString(plusOne(new int[]{0})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1,9})));
    }
}
