package regexMatchCalc;

import java.util.regex.Matcher;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.compile;

public class InputConverter
{
    public OperatingData convertInput(String input)
    {
        Matcher matcher = compile("^(\\d+)[+\\-*x:/\\\\](\\d+)$").matcher(input);

        if (matcher.find())
        {
            int firstNumber = parseInt(matcher.group(1));
            int secondNumber = parseInt(matcher.group(2));
            char operator = parseChar(findOperator(input));

            return new OperatingData(firstNumber, secondNumber, operator);
        }

        throw new IllegalArgumentException();
    }

    private char parseChar(String string)
    {
        return string.charAt(0);
    }

    private String findOperator(String string)
    {
        return string.replaceAll("\\d", "");
    }
}
