package com.example.lettcode.lxt;

import com.alibaba.fastjson.JSON;

/**
 * Created by YUEXINGZHONG on 2019-09-03-11:26
 */
public class Reverse {

    public static void main(String[] args) {
        int A[] = new int[]{1, 2, 3, 4, 5, 6, 7};

        int i, t;
        for (i = 0; i < 7 / 2; i++) {
            t = A[i];
            A[i] = A[7 - i - 1];
            A[7 - i - 1] = t;
        }
        System.out.println(JSON.toJSONString(A));
    }
}
