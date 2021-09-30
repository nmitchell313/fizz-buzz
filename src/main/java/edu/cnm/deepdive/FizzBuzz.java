package edu.cnm.deepdive;

import java.util.EnumSet;

/**
 * Implements a method that computes a fizzbuzz {@link String} value for any non-negative integer.
 * This implementation ignores the common form of the fizzbuzz challenge; instead, this implementation includes a method
 * that produces the single FizzBuzz value for a single integer. This allows for more direct unit testing.
 */

public class FizzBuzz {

    /**
     * Computes and returns the {@link String} FizzBuzz value for a specified non-negative integer.
     * Return value will be "Fizz", "Buzz", or "FizzBuzz", or string representation of {@code value} depending on
     * whether value is divisible by 3, 5, 15 or neither.
     *
     * @param value {@code int} for which the FizzBuzz value will be computed.
     * @return {@link String} corresponding to {@code value}.
     */
    public EnumSet<FizzBuzzValue> getFizzBuzz(int value) {
        EnumSet<FizzBuzzValue> valueSet = EnumSet.noneOf(FizzBuzzValue.class);
        if (value % 3 == 0) {
            valueSet.add(FizzBuzzValue.FIZZ);
        }
        if (value % 5 ==0) {
            valueSet.add(FizzBuzzValue.BUZZ);
        }

        return valueSet;

    }

}
