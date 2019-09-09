package com.example.lettcode.lxt;

/**
 * Created by YUEXINGZHONG on 2019-09-02-16:43
 */
public class NineAndNine {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"    ");

            }
            System.out.println();
        }

    }
}
