package com.example.lettcode.lxt;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by YUEXINGZHONG on 2019-09-02-14:51
 */
public class LargestTimeFromDigits {


    public static void main(String[] args) {
        System.out.println(largestTimeFromDigits1(new int[]{1, 2, 3, 4}));
    }

    public static String largestTimeFromDigits1(int[] A) {
        int ans = -1;

        // Choose different indices i, j, k, l as a permutation of 0, 1, 2, 3
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (j != i)
                    for (int k = 0; k < 4; ++k) {
                        if (k != i && k != j) {
                            int l = 6 - i - j - k;

                            // For each permutation of A[i], read out the time and
                            // record the largest legal time.
                            int hours = 10 * A[i] + A[j];
                            int mins = 10 * A[k] + A[l];
                            if (hours < 24 && mins < 60)
                                ans = Math.max(ans, hours * 60 + mins);
                        }
                    }

            }
        }
        return ans >= 0 ? String.format("%02d:%02d", ans / 60, ans % 60) : "";
    }

    public static String largestTimeFromDigits(int[] A) {
        /**
         * 1.时分秒分开计算
         * 毫秒数0《a《9
         * 秒数0《b《6 当b=6 a一定要为0
         * 分数 0《c《9
         * 时数 0《d《2 当c>4的时候，1<=d<2
         */
        StringBuilder dataStr = new StringBuilder("");
        Integer a = null;
        Integer b = null;
        Integer c = null;
        Integer d = null;
        for (int i = 0; i < A.length - 1; i++) {

            if (0 <= A[i] && A[i] <= 2) {
                if (a == null || a.compareTo(A[i]) < 0) {
                    a = A[i];
                    continue;
                }
            }
            if (0 <= A[i] && A[i] <= 9) {
                if (a != null && a == 2 && A[i] <= 4) {
                    if (0 <= A[i] && A[i] <= 6) {
                        if (c == null || c.compareTo(A[i]) < 0) {
                            c = b;
                        }

                    }
                    b = A[i];
                    continue;
                }
                if (b == null || b.compareTo(A[i]) < 0) {
                    b = A[i];
                    continue;
                }
            }
            if (0 <= A[i] && A[i] <= 6) {
                if (c == null || c.compareTo(A[i]) < 0) {
                    c = A[i];
                    continue;
                }

            }
            if (0 <= A[i] && A[i] <= 9) {
                if (c != null && c == 6 && A[i] == 0) {
                    d = A[i];
                }
                if (d == null || d.compareTo(A[i]) < 0) {
                    d = A[i];
                }
            }
        }
        if (a == null || b == null || c == null || d == null) {
            return dataStr.toString();
        }


        return String.valueOf(a) + b + ":" + c + d;
    }

}
