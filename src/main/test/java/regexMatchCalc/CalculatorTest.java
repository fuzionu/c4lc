package regexMatchCalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    @Test
    void shouldAdd()
    {
        // given
        OperatingData operatingData = new OperatingData(5, 7, '+');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(12, actual);
    }

    @Test
    void shouldSubtract()
    {
        // given
        OperatingData operatingData = new OperatingData(23, 13, '-');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(10, actual);
    }

    @Test
    void shouldMultiply_asterisk()
    {
        // given
        OperatingData operatingData = new OperatingData(7, 7, '*');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(49, actual);
    }

    @Test
    void shouldMultiply_x()
    {
        // given
        OperatingData operatingData = new OperatingData(10, 10, 'x');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(100, actual);
    }

    @Test
    void shouldDivide_colon()
    {
        // given
        OperatingData operatingData = new OperatingData(25, 5, ':');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(5, actual);
    }

    @Test
    void shouldDivide_slash()
    {
        // given
        OperatingData operatingData = new OperatingData(35, 5, '/');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(7, actual);
    }

    @Test
    void shouldDivide_backslash()
    {
        // given
        OperatingData operatingData = new OperatingData(25, 5, '\\');

        // when
        int actual = new Calculator().calculate(operatingData);

        // then
        assertEquals(5, actual);
    }
}