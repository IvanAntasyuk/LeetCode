package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SingleNumbers136 {
    public void singleNumber(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            if (!numsMap.containsKey(i)) {
                numsMap.put(i, 1);
            } else {
                int count = numsMap.get(i);
                numsMap.put(i, count + 1);
            }

        }
    }
}
