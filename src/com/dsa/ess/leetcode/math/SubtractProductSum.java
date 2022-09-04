package com.dsa.ess.leetcode.math;

import static com.dsa.ess.util.Utils.println;

public class SubtractProductSum {
    /*
        1281. Subtract the Product and Sum of Digits of an Integer
        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15
        */
    public static void main(String[] args) {
        var n = 234;
        var mul = 1;
        var sum = 0;
        while (n > 0) {
            mul *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        println("Different is ", mul - sum);
    }
}
