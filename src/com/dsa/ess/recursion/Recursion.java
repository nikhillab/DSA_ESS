package com.dsa.ess.recursion;

import com.dsa.ess.util.Constants;

import static com.dsa.ess.util.Utils.print;

public record Recursion() {
    public int factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public void numRec(int number) {
        if (number < 1) {
            return;
        } else {
            print(Constants.COMMA,number);
            numRec(number - 1);
            print(Constants.COMMA,number);
        }
    }
}
