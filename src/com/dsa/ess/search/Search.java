package com.dsa.ess.search;

import java.util.Arrays;

public record Search(int[] arr, int number) {
    public int linerSearch() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch() {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == number) {
                return mid;
            } else if (arr[mid] > number) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
