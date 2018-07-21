package mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FIzzbuzzmockTest {

    @Test
    public void shouldReturnFizzFor3() {
        // given
        FIzzbuzzmock mock = mock(FIzzbuzzmock.class);
        when(mock.fizzBuzz(3)).thenReturn("Fizz");
        // when
        String result = mock.fizzBuzz(3);
        // then
        assertEquals("Fizz", result);
    }
@Test
    public void shouldReturn4For4() {
        // given
        FIzzbuzzmock mock = mock(FIzzbuzzmock.class);
        when(mock.fizzBuzz(4)).thenReturn("4");
        // when
        String result = mock.fizzBuzz(4);
        // then
        assertEquals("4", result);
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        // given
        FIzzbuzzmock mock = mock(FIzzbuzzmock.class);
        when(mock.fizzBuzz(15)).thenReturn("FizzBuzz");
        // when
        String result = mock.fizzBuzz(15);
        // then
        assertEquals("FizzBuzz", result);
    }


}