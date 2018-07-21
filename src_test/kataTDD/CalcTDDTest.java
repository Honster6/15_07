package kataTDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTDDTest {

    @Test
    public void shouldReturnZeroForEmptyString() {
        // given
        CalcTDD calculator = new CalcTDD();
        // when
        int result = calculator.add("");
        // then
        assertEquals(0, result);
    }
    @Test
    public void shouldReturnOneNumber() {
        // given
        CalcTDD calculator = new CalcTDD();
        // when
        int result = calculator.add("2");
        // then
        assertEquals(2, result);
    }
    @Test
    public void shouldReturnSumForTwoNumbers() {
        // given
        CalcTDD calculator = new CalcTDD();
        // when
        int result = calculator.add("3,2");
        // then
        assertEquals(5, result);
    }
    @Test
    public void shouldReturnSumForAnyAmountOfNumbers() {
        // given
        CalcTDD calculator = new CalcTDD();
        // when
        int result = calculator.add("3,2,4,5");
        // then
        assertEquals(14, result);
    }





}