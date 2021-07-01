package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums2);
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int []{2,5,6},3);
    }
}
