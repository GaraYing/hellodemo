package com.gara.hellodemo.algorithm;

import io.swagger.models.auth.In;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @description: Integer数据翻转
 * @author: GaraYing
 * @create: 2018-09-05 16:08
 **/

/**
 *  算法思路：
 *  1. 考虑到正负数和末位为0的情况（1212 -- 2121  1220 -- 221  -12120 -- -2121）
 *  2. 可以利用StringBuffer的reverse()函数，将Integer 转换成String
 *  3. 考虑到int数据的范围 Integer.MIN_VALUE--INTEGER.MAX_VALUE
 */

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverseInt(12120));
        System.out.println(reverseInt(-12120));
        System.out.println(reverseInt(-1212013578));
    }

    public static int reverseInt(int a) {

        String aStr = "";
        boolean flag = false;
        if (a < 0) {
            aStr = Integer.toString(a).substring(1);
            flag = true;
        } else {
            aStr = Integer.toString(a);
        }
        aStr = new StringBuffer(aStr).reverse().toString();
        if (flag){
            aStr = "-" + aStr;
        }
        long x_long = Long.parseLong(aStr);
        if (x_long > Integer.MAX_VALUE || x_long < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) x_long;
    }
}
