package com.dsa.ess.sort;

public record Sorting(int[] arr) {
    public void bubble() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr().length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(j, j + 1);
            }
        }
    }

    public void insertion() {
        for (int i = 1; i < arr.length; i++) {
            var curr = arr[i];
            var prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public void selection() {
        for (int i = 0; i < arr.length - 1; i++) {
            var minSoFar = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minSoFar]) {
                    minSoFar = j;
                }
            }
            swap(minSoFar, i);
        }
    }

    private void swap(int start, int end) {
        int elm = arr[start];
        arr[start] = arr[end];
        arr[end] = elm;
    }
}
