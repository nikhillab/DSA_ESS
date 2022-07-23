package com.dsa.ess;

import java.util.Arrays;

import static com.dsa.ess.Utils.*;

public class SearchMain {
    public static void main(String[] args) {
        var arr = getArray(10);
        var search = new Search(arr,
                getElementFromArray(arr));
        int linerSearch = search.binarySearch();
        if (linerSearch == -1) {
            print(" Not Found at ", linerSearch, Arrays.toString(search.arr()));
        } else {
            print("Found at ", linerSearch, Arrays.toString(search.arr()));
        }
    }
}
