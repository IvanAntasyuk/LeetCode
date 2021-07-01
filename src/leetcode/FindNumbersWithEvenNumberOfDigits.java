package leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
            if (numsStr[i].length() % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12, 345, 2, 6, 7896}));
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }
}
