package com.dsa.ess.leetcode.math;

import static com.dsa.ess.util.Utils.println;

public class ReverseInteger {
    /* 7. Reverse Integer
    * Given a signed 32-bit integer x, return x with its digits reversed.
    * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    * */
    public static void main(String[] args) {
        var num = 548526823;
        var res = 0;
        while (num !=0) {
            var dig = num % 10;
            int newres = res * 10 + dig;
            if ((newres - dig) / 10 != res) {
                res = 0;
                break;
            }
            res = newres;
            num /= 10;
        }
        println("Result is : ", res);
    }
}
