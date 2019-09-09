package com.example.lettcode.lxt;

/**
 * Created by YUEXINGZHONG on 2019-09-03-10:28
 */
public class nabla {
    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 5; i++) {
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=j;k<9-j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
