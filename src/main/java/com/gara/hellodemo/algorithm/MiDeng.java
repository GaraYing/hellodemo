package com.gara.hellodemo.algorithm;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

/**
 * @author GARA
 * @Title: MiDeng
 * @Description: 幂等判断：循环%2
 * @date 2018/10/26 20:17
 */
public class MiDeng {

    /**
     * 是否是对2幂等性
     * @param n
     * @return
     */
    public static boolean isMiDengOf2(int n) {
        /*
            4    0100
            4-1  0011
         */
        return (n & (n - 1)) == 0;
    }

    public static boolean isMiDengOf22(int n){
        while (true){
            if (n % 2 != 0){
                return false;
        }else {
            return true;
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(isMiDengOf2(1024));
        for (int i = 0; i < 1000; i++) {
            isMiDengOf2(1024);
        }
        System.out.println(System.currentTimeMillis() - start);

        long start2 = System.currentTimeMillis();
        System.out.println(isMiDengOf22(1024));

        for (int i = 0; i < 1000; i++) {
            isMiDengOf2(1024);
        }
        System.out.println(System.currentTimeMillis() - start2 );

        System.out.println(2 >>> 1);
    }
}
