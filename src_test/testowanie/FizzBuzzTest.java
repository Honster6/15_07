package testowanie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void shouldReturnFizzIfNumberIsDividedBy3() {
        // given
        FizzBuzz fizz = new FizzBuzz();
        // when
        String result = fizz.fizzBuzz(3);
        // then
        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzIfNumberIsDividedBy5() {
        // given
        FizzBuzz buzz = new FizzBuzz();
        // when
        String result = buzz.fizzBuzz(5);
        // then
        assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsDividedBy3And5() {
        // given
        FizzBuzz fizzbuzz = new FizzBuzz();
        // when
        String result = fizzbuzz.fizzBuzz(15);
        // then
        assertEquals("FizzBuzz", result);
    }


}