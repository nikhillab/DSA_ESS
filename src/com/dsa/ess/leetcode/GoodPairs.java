package com.dsa.ess.leetcode;

import java.util.HashMap;

import static com.dsa.ess.util.Utils.println;

public class GoodPairs {
    /*
    1512. Number of Good Pairs
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    */
    public static void main(String[] args) {
        var num = new int[]{1, 2, 3, 1, 1, 3};
        var count = 0;

        //native solution
        for (var i = 0; i < num.length; i++) {
            for (var j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    println("(", num[i], ",", num[j], ")");
                    count++;
                }
            }
        }
        println("Count is : ", count);

        var map = new HashMap<Integer, Integer>();
        var ans = 0;
        for (var dig : num
        ) {
            int curr = map.getOrDefault(dig, 0);
            ans += curr;
            map.put(dig, curr + 1);
        }
        println("Answer is : ",ans);

    }
}
