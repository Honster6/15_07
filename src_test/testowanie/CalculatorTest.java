package testowanie;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public static void setUp() { //przed wszystkim wiadomosc
        System.out.println("Before all");
    }

    @AfterAll
    public static void tearDown() { //wiadomosc po wszystkim
        System.out.println("After all");
    }

    @BeforeEach
    public void setUpEach() { // c przed kazdym testem
        System.out.println("Before each");
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDownEach() { //  po kqzdym tescie
        System.out.println("After each");
    }


    @DisplayName("=^..^=") // wyswietlanie wlasnej nazwy testu
    @Test
    public void shouldReturn50WhenAdding20And30() {
        // given
        Calculator calculator = new Calculator();
        // when
        int result = calculator.add(20, 30);
        // then
        assertEquals(50, result);
    }

    @DisplayName("(╯°□°）╯︵ ┻━┻")
    @Test
    public void shouldReturn40WhenAdding10And30() {
        // given
        Calculator calculator = new Calculator();
        // when
        int result = calculator.add(10, 30);
        // then
        assertEquals(50, result);
    }


    private int lifecycleMe = 0;

    @RepeatedTest(5) // test, który sie powtarza x razy
    public void shouldCreateNewInstance() {
        assertEquals(0, lifecycleMe++);
    }

    @ParameterizedTest
    @ValueSource(strings = {"RED", "GREEN", "BLACK", "ORANGE"}) // podajemy parametry z jakimi test ma sie przeprowadzic
    @Test
    public void shouldTestIfColorIsABaseColor(String color) {
        // given
        Map<String, Boolean> baseColors = new HashMap<>();
        baseColors.put("RED", true);
        baseColors.put("GREEN", true);
        baseColors.put("BLUE", true);
        // when

        // then
        assertTrue(baseColors.getOrDefault(color, false));
    }

    @ParameterizedTest
    @DisplayName("ヽ(。_°)ノ")
    @ValueSource(ints = {1, 2, 3})
        // przekazujemy parametry z ktorych chcemy skorzystac
    void testWithValueSource(int argument) {
        assertTrue(argument > 0 && argument < 3); // podajemy warunek, jaki chcemysprawdzić
    }

    @ParameterizedTest
    @DisplayName("(｡◕‿‿◕｡)")
    @MethodSource("stringProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> stringProvider() {
        return Stream.of("foo", "bar");
    }

    @ParameterizedTest
    @DisplayName("¯\\(◉◡◔)/¯")
    @CsvSource({"foo, 1", "bar, 2", "baz, 3"})
    void testWithCSVSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void shouldRunOnLinuxAndMac() {
        assertEquals("Hello from Linux", "Wait, what? ¯\\(◉◡◔)/¯");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_9})
    void onlyOnJava8() {
        assertEquals("Is it Java9?", "No ¯\\(◉◡◔)/¯ its 8");
    }

    @Test
    public void shouldParseValidNumber() {
        // given

        // when
        int result = calculator.parse("asdf");
        // then
        assertEquals(100, result);
    }

    @Test
    public void shouldThrowNumberFormatExceptionForInvalidString() {
        // given

        // when

        // then
        assertThrows(NullPointerException.class, ()
                -> calculator.parse("100"));
    }

    @Test
    public void shouldThrowWightMessageForInvalidString() {
        NumberFormatException result = assertThrows(NumberFormatException.class, ()
                -> calculator.parse("result"));
        assertEquals("Niepoprawny numer", result.getMessage());

    }




}