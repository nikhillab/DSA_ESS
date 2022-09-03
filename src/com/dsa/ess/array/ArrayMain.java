package com.dsa.ess.array;


import static com.dsa.ess.util.Utils.getArray;
import static com.dsa.ess.util.Utils.print;

public class ArrayMain {
    public static void main(String[] args) {
        var array = new Array(getArray(5));
//        print("Array is :",Arrays.toString(array.arr()));
//        array.reverse();
//        print("Reverse is :" ,Arrays.toString(array.arr()));
//        array.printPair();
        //array.printSubArray();
//        print(array.subArraySumBF());
 //       print("Result is :",array.numIdenticalPairs(new int[]{1,1,1,1}));
//        print(array.subArrayPrefixSum());
//        print(array.maxSubArray());
        var newArray=new Array(new int[]{-1,-1,2,3,5});
        print(newArray.lowerBound(4));

    }
}
