package com.dsa.ess;

import java.util.Random;

public final class Utils {
    public static void print(Object... args) {
        print(Constants.NONE, args);
    }

    public static void print(Constants separator, Object... args) {
        var builder = new StringBuilder();
        for (var element : args) {
            builder.append(element.toString()).append(separator.toString());
        }
        System.out.println(builder.toString());
    }

    public static int[] getArray(final int size) {
        final int[] arr = new int[size];
        final var generator = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt(-20, 50);
        }
        return arr;
    }
    /*
    * return random element from the given array.
    * */
    public static int getElementFromArray(final int [] arr) {
        final var generator = new Random();
        return arr[generator.nextInt(0,arr.length-1)];
    }

}
