package edu.cnm.deepdive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    static final int[] fizzValues = {21, 999, 3, 9};
    static final int[] buzzValues = {10, 95, 65, 500};
    static final int[] fizzBuzzValues = {15, 90, 0, 60, 135, 1500};
    static final int[] neitherValues = {17, 2, 98, 7, 97};


    @Test
    @DisplayName("Test Fizz Values")
    void getFizzBuzz_fizz() {
        FizzBuzz fb = new FizzBuzz();
        for (int value : fizzValues) {
            assertEquals(FizzBuzz.FIZZ_VALUE, fb.getFizzBuzz(value));
        }

    }

    @Test
    @DisplayName("Test Buzz Values")
    void getFizzBuzz_buzz() {
        FizzBuzz fb = new FizzBuzz();
        for (int value : buzzValues) {
            assertEquals(FizzBuzz.BUZZ_VALUE, fb.getFizzBuzz(value));
        }

    }

    @Test
    @DisplayName("Test FizzBuzz Values")
    void getFizzBuzz_fizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        for (int value : fizzBuzzValues) {
            assertEquals(FizzBuzz.FIZZ_BUZZ_VALUE, fb.getFizzBuzz(value));
        }

    }

    @Test
    @DisplayName("Test Neither Values")
    void getFizzBuzz_neither() {
        FizzBuzz fb = new FizzBuzz();
        for (int value : neitherValues) {
            assertEquals(String.valueOf(value), fb.getFizzBuzz(value));
        }

    }

}