package com.dsa.ess;

import static com.dsa.ess.Utils.getArray;
import static com.dsa.ess.Utils.print;

public class ArrayMain {
    public static void main(String[] args) {
        var array = new Array(getArray(5));
//        print("Array is :",Arrays.toString(array.arr()));
//        array.reverse();
//        print("Reverse is :" ,Arrays.toString(array.arr()));
//        array.printPair();
        //array.printSubArray();
//        array.subArraySumBF();
        print("Result is :",array.numIdenticalPairs(new int[]{1,1,1,1}));

    }
}
