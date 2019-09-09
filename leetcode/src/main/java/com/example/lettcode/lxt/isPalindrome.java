package com.example.lettcode.lxt;

/**
 * Created by YUEXINGZHONG on 2019-08-30-18:28
 */
public class isPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-124));
    }

    public static boolean isPalindrome(int x) {
        Integer x1 = x;
        String x1Str = x1.toString();
        StringBuilder str = new StringBuilder();
        for (int i = x1Str.length(); i > 0; i--) {
            str.append(x1Str, i - 1, i);
        }
        try {
            return x1Str.equals(str.toString());
        } catch (Exception e) {
            return false;
        }
    }
}
