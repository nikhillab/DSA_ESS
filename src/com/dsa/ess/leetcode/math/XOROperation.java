package com.dsa.ess.leetcode.math;

import static com.dsa.ess.util.Utils.println;

public class XOROperation {
    /* 1486. XOR Operation in an Array
    * You are given an integer n and an integer start.
    Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
    Return the bitwise XOR of all elements of nums.
    *
    * */

    public static void main(String[] args) {
        var n = 4;
        var start = 3;
        var num = new int[n];
        num[0] = start + 2 * 0;
        int res = num[0];

        for (int i = 1; i < n; i++) {
            num[i] = start + 2 * i;
            res ^= num[i];
        }
        println("Result is : ", res);
    }
}
