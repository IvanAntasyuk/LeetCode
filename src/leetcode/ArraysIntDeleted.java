package leetcode;

import java.util.Arrays;

public class ArraysIntDeleted {
    public static int removeElement(int[] nums) {

        final int len = nums.length;
        if(len == 0 || len == 1)
            return len;

        int newIndex = 1;
        int nextElement;

        for(int index = 1; index < len; index++){
            if((nextElement = nums[index]) > nums[index - 1])
                nums[newIndex++] = nextElement;
        }

        return newIndex;
        }
        public static void main (String[]args){
            System.out.println(removeElement(new int[]{0,0,1,1,1,2,2,3,3,4}));

        }
    }