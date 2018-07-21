package testowanie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator21_07Test {
    @Test
    public void shouldReturnZeroSixFor3And5() throws Exception {
        // given
        Calculator21_07 calculator = new Calculator21_07();
        // when
        float result = calculator.sinus(3, 5);
        // then
        assertEquals(0.6, result, 0.0001);
    }
@Test
public void shouldThrowExceptionWhenHypotenuseIsShorterThanCathetus() {
    // given
    Calculator21_07 calculator = new Calculator21_07();
    // when

    // then
    assertThrows(IllegalArgumentException.class, () -> (calculator.sinus(5, 3)));
}
    @Test
    public void shouldThrowExceptionWhenLowerThanZero() {
        // given
        Calculator21_07 calculator = new Calculator21_07();
        // when

        // then
        assertThrows(IllegalArgumentException.class, () -> (calculator.sinus(-5, 3)));
    }


}