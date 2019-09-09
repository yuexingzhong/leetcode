package com.example.lettcode.lxt;

import java.util.Scanner;

/**
 * Created by YUEXINGZHONG on 2019-09-05-9:18
 */
public class test {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        int i = 0;
        while (!flag) {
            System.out.println("請輸入 1，2，3");
            i = scanner.nextInt();
            if (i == 1 || i == 2 || i == 3) {
                flag = true;
            }
        }
        System.out.println(i);
    }
}
