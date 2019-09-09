package com.example.lettcode.lxt;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by YUEXINGZHONG on 2019-08-30-16:52
 */
public class TwoNumAdd {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     * 来源：力扣（LeetCode）
     */



    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 3, 7, 8}, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            numMap.put(nums[i], i);
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                return   new int[]{i, numMap.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
