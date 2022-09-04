package com.dsa.ess.leetcode.math;

import static com.dsa.ess.util.Utils.print;

public class ReduceNumberToZero {
    /* 1342. Number of Steps to Reduce a Number to Zero
    * Given an integer num, return the number of steps to reduce it to zero.
      In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    * */
    public static void main(String[] args) {
        var num = 14;
        var count = 0;
        while (num != 0) {
            if ((num | 1) > num) num = num >> 1;
            else num -= 1;
            count++;
        }
        print("Steps is : ", count);

    }
}
