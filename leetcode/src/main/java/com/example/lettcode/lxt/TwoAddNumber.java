package com.example.lettcode.lxt;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by YUEXINGZHONG on 2019-08-30-17:15
 */
public class TwoAddNumber {

    /**
     * 求数组中得和为目标值，得出下标
     */
    public static void main(String[] args) {
        int[] n = new int[]{1, 3, 4, 5};
        int ra = 4;
        System.out.println(twoSum(n, ra));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] n = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {
                if (i != i1 && nums[i1] + nums[i] == target) {
                    n[0] = i;
                    n[1] = i1;
                }
            }

        }
        return n;
    }


}
