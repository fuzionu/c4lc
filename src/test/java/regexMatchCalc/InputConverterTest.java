package regexMatchCalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputConverterTest
{
    @Test
    void shouldConvertAdding()
    {
        // given
        String input = "12+12";
        OperatingData expected = new OperatingData(12, 12, '+');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldConvertSubtracting()
    {
        // given
        String input = "31-7";
        OperatingData expected = new OperatingData(31, 7, '-');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldConvertMultiplying_asterisk()
    {
        // given
        String input = "3*3";
        OperatingData expected = new OperatingData(3, 3, '*');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldConvertMultiplying_x()
    {
        // given
        String input = "2x7";
        OperatingData expected = new OperatingData(2, 7, 'x');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldConvertDividing_colon()
    {
        // given
        String input = "21:7";
        OperatingData expected = new OperatingData(21, 7, ':');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldConvertDividing_slash()
    {
        // given
        String input = "30/10";
        OperatingData expected = new OperatingData(30, 10, '/');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldConvertDividing_backslash()
    {
        // given
        String input = "45\\15";
        OperatingData expected = new OperatingData(45, 15, '\\');

        // when
        OperatingData actual = new InputConverter().convertInput(input);

        // then
        assertEquals(expected.firstNumber, actual.firstNumber);
        assertEquals(expected.secondNumber, actual.secondNumber);
        assertEquals(expected.operator, actual.operator);
    }

    @Test
    void shouldThrowIllegalArgumentException()
    {
        // given
        String input = "wtf";

        // then
        assertThrows(IllegalArgumentException.class, () -> new InputConverter().convertInput(input));
    }
}