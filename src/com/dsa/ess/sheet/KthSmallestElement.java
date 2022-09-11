package com.dsa.ess.sheet;

import java.util.*;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int N = arr.length;
        int K = 4;
        // since counting starts from 0 so to find kth
        // element we need to reduce K by 1
        K--;
        // for storing elements in sorted form
        // in set we will use TreeSet
        Set<Integer> s = new TreeSet<>();
        // Adding elements to set
        for (int i = 0; i < N; i++)
            s.add(arr[i]);
        // Use iterator method of Iterator
        // for the traversal
        Iterator<Integer> itr = s.iterator();
        while (K > 0) {
            itr.next();
            K--;
        } // itr points to the Kth element in the set
        System.out.println(itr.next());
    }
}