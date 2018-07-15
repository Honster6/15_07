package testowanie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
//    @ParameterizedTest
//    @ValueSource(ints = {3, 7, 9})
//    public void shouldReturnFizz(int number) {
//        // given
//        FizzBuzz fizz = new FizzBuzz();
//        // when
//        assertTrue(number % 3 == 0);
//        // then
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {5, 10, 15, 20})
//    public void shouldReturnBuzz(int number) {
//        FizzBuzz buzz = new FizzBuzz();
//        assertTrue(number % 5 == 0);
//
//    }
//    @ParameterizedTest
//    @ValueSource(ints = {15, 30, 45})
//    public void shouldReturnFizzBuzz(int number) {
//        FizzBuzz fizzbuzz = new FizzBuzz();
//        assertTrue(number % 15 == 0);
//    }

    @ParameterizedTest
    @CsvSource({"Fizz, 3", "Fizz, 6", "Fizz, 9"})
    void testWithCsvSource (String first, int second) {
        FizzBuzz fizz = new FizzBuzz();
        String result = fizz.fizzBuzz(second);
        assertEquals(result, first);

    }







}