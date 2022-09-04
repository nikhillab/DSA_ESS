package com.dsa.ess.leetcode.math;

import java.util.Arrays;

import static com.dsa.ess.util.Utils.print;

public class SplittingDigits {

   /*
    2160. Minimum Sum of Four Digit Number After Splitting Digit
    You are given a positive integer num consisting of exactly four digits.
    Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2,
     and all the digits found in num must be used.
    For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
    Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
    Return the minimum possible sum of new1 and new2.
    */
    public static void main(String[] args) {
        var num = 2932;
        var nums = new int[4];
        var i = nums.length - 1;
        var temp = num;
        while (temp > 0) {
            nums[i--] = temp % 10;
            temp /= 10;
        }
        print(Arrays.toString(nums));
        Arrays.sort(nums);
        int num1 = nums[0] * 10 + nums[2]; // 1st and 3rd digit
        int num2 = nums[1] * 10 + nums[3]; // 2nd and 4th digit
        print(num1 + num2);
    }
}
