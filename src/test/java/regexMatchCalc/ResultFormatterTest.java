package regexMatchCalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultFormatterTest
{
    @Test
    void shouldFormatAddingResult()
    {
        // given
        OperatingData operatingData = new OperatingData(5, 5, '+');

        // when
        String actual = new ResultFormatter().formatResult(operatingData);

        // then
        assertEquals("5 + 5 = ", actual);
    }

    @Test
    void shouldFormatSubtractingResult()
    {
        // given
        OperatingData operatingData = new OperatingData(12, 6, '-');

        // when
        String actual = new ResultFormatter().formatResult(operatingData);

        // then
        assertEquals("12 - 6 = ", actual);
    }

    @Test
    void shouldFormatMultiplyingResult()
    {
        // given
        OperatingData operatingData = new OperatingData(5, 5, '*');

        // when
        String actual = new ResultFormatter().formatResult(operatingData);

        // then
        assertEquals("5 x 5 = ", actual);
    }

    @Test
    void shouldFormatDividingResult()
    {
        // given
        OperatingData operatingData = new OperatingData(35, 7, '/');

        // when
        String actual = new ResultFormatter().formatResult(operatingData);

        // then
        assertEquals("35 : 7 = ", actual);
    }
}