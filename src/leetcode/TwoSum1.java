package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i< nums.length;i++){
            int result  = target - nums[i];
            if (map.containsKey(result)){
                return new int[] {map.get(result),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{7,1,3},10)));
    }
}
