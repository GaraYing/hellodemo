package com.gara.hellodemo.algorithm;

import org.springframework.util.Assert;

/**
 * @author GARA
 * @Title: BinarySearch
 * @Description: 二分查找
 * @date 2018/10/25 20:45
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {6, 12, 33, 87, 90, 97, 108, 561};
        System.out.println(binarySearch(arr, 87));
        System.out.println(binarySearch(arr, 87, 0, arr.length - 1));
        System.out.println(binarySearch(arr, 3, 87, arr.length - 1));
    }

    public static int binarySearch(int[] data, int x) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (data[mid] == x) return mid;
            if (data[mid] < x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int x, int low, int high) {
        int mid = (low + high) / 2;
        if ( low > high || x < data[low] || x > data[high]) return -1;
        if (x < data[mid]) {
            return binarySearch(data, x, low, mid - 1);
        } else if (x > data[mid]) {
            return binarySearch(data, x, mid + 1, high);
        } else {
            return mid;
        }
    }
}
