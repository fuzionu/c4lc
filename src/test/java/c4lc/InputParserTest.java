package c4lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest
{
    @Test
    void shouldConvertAdding()
    {
        // given
        String input = "12+12";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(12, actual.firstNumber);
        assertEquals(12, actual.secondNumber);
        assertEquals('+', actual.operator);
    }

    @Test
    void shouldConvertSubtracting()
    {
        // given
        String input = "31-7";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(31, actual.firstNumber);
        assertEquals(7, actual.secondNumber);
        assertEquals('-', actual.operator);
    }

    @Test
    void shouldConvertMultiplying_asterisk()
    {
        // given
        String input = "3*3";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(3, actual.firstNumber);
        assertEquals(3, actual.secondNumber);
        assertEquals('*', actual.operator);
    }

    @Test
    void shouldConvertMultiplying_x()
    {
        // given
        String input = "2x7";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(2, actual.firstNumber);
        assertEquals(7, actual.secondNumber);
        assertEquals('x', actual.operator);
    }

    @Test
    void shouldConvertDividing_colon()
    {
        // given
        String input = "21:7";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(21, actual.firstNumber);
        assertEquals(7, actual.secondNumber);
        assertEquals(':', actual.operator);
    }

    @Test
    void shouldConvertDividing_slash()
    {
        // given
        String input = "30/10";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(30, actual.firstNumber);
        assertEquals(10, actual.secondNumber);
        assertEquals('/', actual.operator);
    }

    @Test
    void shouldConvertDividing_backslash()
    {
        // given
        String input = "45\\15";

        // when
        OperatingData actual = new InputParser().parseInput(input);

        // then
        assertEquals(45, actual.firstNumber);
        assertEquals(15, actual.secondNumber);
        assertEquals('\\', actual.operator);
    }

    @Test
    void shouldThrowIllegalArgumentException()
    {
        // given
        String input = "wtf";

        // then
        assertThrows(IllegalArgumentException.class, () -> new InputParser().parseInput(input));
    }
}