package leetcode;

import java.util.Arrays;

public class SquaresOfASortedArraySolution {
    public static int[] sortedSquares(int[] nums) {
        int a = nums.length - 1;
        int b = nums.length - 1;
        int[] result = new int[a + 1];
        int c = 0;
        while (c <= b) {
            if (nums[c] * nums[c] > nums[b] * nums[b]) {
                result[a] = nums[c] * nums[c];
                c++;
            } else {
                result[a] = nums[b] * nums[b];
                b--;
            }
            a--;
        }
        return result;
    }

    public static int[] sortedSquaresTwo(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Вариант один : " + Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("Вариант два : " + Arrays.toString(sortedSquaresTwo(new int[]{-4, -1, 0, 3, 10})));
        System.out.println("Вариант один : " + Arrays.toString(sortedSquares(new int[]{-7, -3, 2, 3, 11})));
        System.out.println("Вариант два : " + Arrays.toString(sortedSquaresTwo(new int[]{-7, -3, 2, 3, 11})));


    }
}
