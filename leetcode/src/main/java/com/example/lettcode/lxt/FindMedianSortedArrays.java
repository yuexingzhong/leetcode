package com.example.lettcode.lxt;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by YUEXINGZHONG on 2019-09-03-16:05
 */
public class FindMedianSortedArrays {


    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int aNums1 : nums1) {
            list.add(aNums1);
        }
        for (int aNums2 : nums2) {
            list.add(aNums2);
        }
        list.sort(Comparator.comparingInt(Integer::intValue).reversed());
        if (list.size() % 2 != 0) {
            //奇数的时候取中间的
            return list.get((list.size() / 2));
        } else {
            //偶数的时候取两个
            DecimalFormat df2 = new DecimalFormat("###.000");
            return Double.valueOf(df2.format((float)(list.get((list.size() / 2)) + list.get((list.size() / 2) - 1)) / 2));

        }

    }




}
