package com.dsa.ess.sort;

import java.util.Arrays;

import static com.dsa.ess.util.Utils.getArray;
import static com.dsa.ess.util.Utils.print;

public class SortingMain {
    public static void main(String[] args) {
        Sorting sorting = new Sorting(getArray(10));
        //sorting.bubble();
        //sorting.insertion();
        sorting.selection();
        print(Arrays.toString(sorting.arr()));

    }
}
