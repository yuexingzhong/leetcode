package com.example.lettcode.lxt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 描述:
 * User: YueXZ
 * DateTime: 2021/7/9 16:21
 * Version：1.0.0
 */
public class ThreeNum {

    /**
     * 求数组中得和为目标值，得出下标
     */
    public static void main(String[] args) {
        int[] n = new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(threeSum(n));
        System.out.println("123");
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int two = i + 1, three = nums.length - 1;
            while (two < three) {
                int sum = nums[i] + nums[two] + nums[three];
                if (sum > 0) {
                    while (two < three && nums[two] == nums[++two]) ;
                } else if (sum < 0) {
                    while (two < three && nums[three] == nums[--three]) ;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[two]);
                    list.add(nums[three]);
                    result.add(list);
                    while(two < three && nums[two] == nums[++two]);
                    while(two < three && nums[three] == nums[--three]);

                }
            }

        }
        return result;
    }
}
