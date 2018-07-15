package testowanie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FarenheitTest {

    @Test
    public void shouldChangeFromCelsiusToFarenheit() {
        // given
        Farenheit faren =  new Farenheit();
        // when
        double result = faren.changeToFarenheit(30);
        // then
        assertEquals(86, result);
    }
    @Test
    public void shouldChangeFromFarenheitToCelsius() {
        // given
        Farenheit celsius = new Farenheit();
        // when
        double result = celsius.changeToCelsius(86);
        // then
        assertEquals(30, result);
    }



}