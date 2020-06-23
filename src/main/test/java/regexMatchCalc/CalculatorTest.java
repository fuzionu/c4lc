package regexMatchCalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    @Test
    void shouldAdd()
    {
        // given
        int firstNumber = 5;
        int secondNumber = 7;
        char operator = '+';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(12, actual);
    }

    @Test
    void shouldSubtract()
    {
        // given
        int firstNumber = 23;
        int secondNumber = 13;
        char operator = '-';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(10, actual);
    }

    @Test
    void shouldMultiply_asterisk()
    {
        // given
        int firstNumber = 7;
        int secondNumber = 7;
        char operator = '*';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(49, actual);
    }

    @Test
    void shouldMultiply_x()
    {
        // given
        int firstNumber = 10;
        int secondNumber = 10;
        char operator = 'x';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(100, actual);
    }

    @Test
    void shouldDivide_colon()
    {
        // given
        int firstNumber = 25;
        int secondNumber = 5;
        char operator = ':';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(5, actual);
    }

    @Test
    void shouldDivide_slash()
    {
        // given
        int firstNumber = 35;
        int secondNumber = 5;
        char operator = '/';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(7, actual);
    }

    @Test
    void shouldDivide_backslash()
    {
        // given
        int firstNumber = 25;
        int secondNumber = 5;
        char operator = '\\';

        // when
        int actual = new Calculator().calculate(firstNumber, secondNumber, operator);

        // then
        assertEquals(5, actual);
    }
}