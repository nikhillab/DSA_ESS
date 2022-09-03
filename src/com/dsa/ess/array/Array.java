package com.dsa.ess.array;

import com.dsa.ess.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.dsa.ess.util.Utils.print;


public record Array(int[] arr) {
    public void reverse() {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            swap(start, end);
            start += 1;
            end -= 1;
        }
    }

    public void printPair() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                print(arr[i], "-", arr[j]);
            }
        }
    }

    public void printSubArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                }
                print();
            }
        }
    }

    public int subArraySumBF() {
        var msum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                var csum = 0;
                for (int k = i; k < j; k++) {
                    csum += arr[k];
                }
                msum = Math.max(msum, csum);
            }
        }
        return msum;
    }

    public int subArrayPrefixSum() {
        var msum = Integer.MIN_VALUE;
        var prefixSum = new int[arr.length + 2];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                var csum = i > 0 ? prefixSum[j] - prefixSum[i - 1] : prefixSum[j];
                msum = Math.max(msum, csum);
            }
        }

        return msum;
    }

    public int maxSubArray() {
        int res = arr[0];
        int currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            res = Math.max(res, currMax);
        }
        return res;
    }

    /*
    * Given an array of integers nums, return the number of good pairs.
     A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    * */
    public int numIdenticalPairs(int[] nums) {

        if (nums.length == 1)
            return 0;

        var frequency = new HashMap<Integer, Integer>();
        var count = 0;

        for (var i = 0; i < nums.length; i++) {
            var key = nums[i];
            if (!frequency.containsKey(key))
                frequency.put(key, 1);

            else {
                int freq = frequency.get(key);
                count += freq;
                print("count is ", count);
                frequency.put(key, freq + 1);
            }

        }

        return count;
    }

    /*
    for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
    * */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        var len = nums.length;
        var ans = new int[len];
        for (var i = 0; i < len; i++) {
            var count = 0;
            for (var j = 0; j < len; j++) {
                if (i == j) continue;

                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    /*
    * We are given a list nums of integers representing a list compressed with run-length encoding.
    Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
    Return the decompressed list.
    * */
    public int[] decompressRLElist() {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while (i + 1 < arr.length - i) {
            var freq = arr[2 * i];
            var val = arr[2 * i + 1];
            for (int j = 0; j < freq; j++) {
                res.add(val);
            }
            i++;
        }
        var resArr = new int[res.size()];
        for (int j = 0; j < res.size(); j++) {
            resArr[j] = res.get(j);
        }
        return resArr;
    }

    /*
     * Lower bound in sorted Array
     * */
    public Pair lowerBound(int number) {
        Arrays.sort(arr);
        print("Number is :", number, Arrays.toString(arr));
        var res = Arrays.binarySearch(arr, number);
        if (0 > res) {
            return new Pair(Math.abs(res) - 1, arr[Math.abs(res) - 1]);
        } else {
            while (res > 0) {
                if (arr[res - 1] == number) {
                    res--;
                } else {
                    return new Pair(Math.abs(res) - 1, arr[Math.abs(res) - 1]);
                }
            }
            return new Pair(Math.abs(res) - 1, arr[Math.abs(res) - 1]);
        }

    }

    public int closestSumOf2Number(int target) {
        Arrays.parallelSort(arr);
        int cSum = arr[0] + arr[1];
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (Math.abs(target - sum) < Math.abs(target - cSum)) {
                cSum = sum;
            }
            if (sum < target) {
                l++;
            } else
                r--;

        }
        return cSum;
    }

    private void swap(int start, int end) {
        int elm = arr[start];
        arr[start] = arr[end];
        arr[end] = elm;
    }
}
