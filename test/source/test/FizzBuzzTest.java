package test;

import dssc.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void numberOne() {
        check(1, "1");
    }

    @Test
    void numberThree() {
        check(3, "Fizz");
    }

    @Test
    void numberFive() {
        check(5, "Buzz");
    }

    @Test
    void numberFifteen() {
        check (15, "FizzBuzz");
    }

    private void check (int number, String expected){
        FizzBuzz fizzbuzz = new FizzBuzz(number);
        assertEquals(expected, fizzbuzz.convertNumberToString());
    }
}
