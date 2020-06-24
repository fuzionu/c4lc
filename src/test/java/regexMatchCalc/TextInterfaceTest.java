package regexMatchCalc;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class TextInterfaceTest extends StandardInputTest
{
    @Test
    void shouldShowStartingMessageAndClose()
    {
        // given
        input("exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldDoAdding()
    {
        // given
        input("5+5", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> 5 + 5 = 10",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldDoSubtracting()
    {
        // given
        input("12-7", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> 12 - 7 = 5",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldDoMultiplying()
    {
        // given
        input("3*3", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> 3 x 3 = 9",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldDoDividing()
    {
        // given
        input("28:7", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> 28 : 7 = 4",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldNotAllowDividingByZero()
    {
        // given
        input("1:0", "5:5", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Dividing by zero is not allowed. Type again.",
                "> 5 : 5 = 1",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldNotAllowNonDigitInput()
    {
        // given
        input("wtf", "omg", "2+2", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Wrong input. Type again.",
                "> Wrong input. Type again.",
                "> 2 + 2 = 4",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }

    @Test
    void shouldContinueWithEmptyInput()
    {
        // given
        input("", "  ", "  ", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> > > > Closing...");
    }

    @Test
    void shouldContinueWithEmptyInputAfterWrongInput()
    {
        // given
        input("abc", "", " ", "exit");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Wrong input. Type again.",
                "> > > Closing...");
    }

    @Test
    void shouldIgnoreWhitespace()
    {
        // given
        input(" 12 +   3", " exit  ");

        // when
        new TextInterface(new Scanner(System.in)).start();

        // then
        assertPrinted("",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> 12 + 3 = 15",
                "",
                "Regex match calculator.",
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`",
                "Or type `exit` to close the program.",
                "> Closing...");
    }
}