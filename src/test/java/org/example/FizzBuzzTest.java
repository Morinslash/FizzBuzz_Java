package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "7,7"})
    public void return_number_as_string(int input, String result) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(result, fizzBuzz.fizzIt(input));
    }

    @ParameterizedTest
    @CsvSource({"3,Fizz", "6,Fizz", "9,Fizz"})
    public void return_Fizz_if_input_divisible_by_3(int input, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.fizzIt(input));
    }

    @ParameterizedTest
    @CsvSource({"5,Buzz", "10,Buzz", "20,Buzz"})
    public void return_Buzz_if_input_divisible_by_5(int input, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.fizzIt(input));
    }

    @ParameterizedTest
    @CsvSource({"15,FizzBuzz", "30,FizzBuzz", "45,FizzBuzz"})
    public void return_FizzBuzz_if_input_divisible_by_3_and_5(int input, String expected) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(expected, fizzBuzz.fizzIt(input));
    }
}