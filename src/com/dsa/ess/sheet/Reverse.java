package com.dsa.ess.sheet;

import com.dsa.ess.util.Utils;

import java.util.Arrays;

import static com.dsa.ess.util.Utils.println;

public class Reverse {
    /*
    * 344. Reverse String
     Write a function that reverses a string. The input string is given as an array of characters s.
    You must do this by modifying the input array in-place with O(1) extra memory.
    * */
    public static void reverseString(char[] cha) {
        int s = 0;
        int l = cha.length - 1;
        while (l >= s) {
            char temp = cha[s];
            cha[s] = cha[l];
            cha[l] = temp;
            l--;
            s++;
        }
    }

    /*
    541. Reverse String II
    Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
    If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters,
    then reverse the first k characters and leave the other as original.
    Example 1:
        Input: s = "abcdefg", k = 2
        Output: "bacdfeg"
    Example 2:
        Input: s = "abcd", k = 2
        Output: "bacd"
    */
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            println("i is ", i, "| arr[i] is ", arr[i], "| j is ", j, "| arr[j] is ", arr[j]);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }

    public static void maxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (var num : arr
        ) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        println("MAX is :", max, "| MIN is ", min);
    }


    public static void main(String[] args) {
        println(reverseStr("abcdefg", 2));
        var arr=Utils.getArray(10);
        println(Arrays.toString(arr));
        maxAndMin(arr);
    }

    private static void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
