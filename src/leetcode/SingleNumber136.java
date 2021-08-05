package leetcode;


import java.util.HashSet;


public class SingleNumber136 {
    public  int singleNumber(int[] nums) {
        HashSet<Integer> answer = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (answer.contains(nums[i])) {
                answer.remove(nums[i]);
            } else {
                answer.add(nums[i]);
            }
        }
        for (int num : answer) {
            return num;
        }
        return 0;
    }

}
