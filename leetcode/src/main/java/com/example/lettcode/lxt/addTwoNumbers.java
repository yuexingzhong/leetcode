package com.example.lettcode.lxt;

import java.lang.reflect.Parameter;

/**
 * Created by YUEXINGZHONG on 2019-08-30-17:15
 */
public class addTwoNumbers {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     * <p>
     * 输入: 123
     * 输出: 321
     * 示例 2:
     * <p>
     * 输入: -123
     * 输出: -321
     * 示例 3:
     * <p>
     * 输入: 120
     * 输出: 21
     */
    public static void main(String[] args) {
        System.out.println(reverse1(-684989999));
    }

    public static int reverse(int x) {
        Integer x1 = x;
        String x1Str = x1.toString();
        Boolean flag = false;
        if (x1Str.contains("-")) {
            flag = true;
            x1Str = x1Str.substring(1, x1Str.length());
        }
        StringBuilder str = new StringBuilder();
        for (int i = x1Str.length(); i > 0; i--) {
            str.append(x1Str, i - 1, i);
        }
        try {
            x1Str = str.toString();
            if (flag) {
                x1Str = "-"+x1Str;
            }
            return Integer.valueOf(x1Str);
        } catch (Exception e) {
            return 0;
        }

    }

    public static int reverse1(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }


}
