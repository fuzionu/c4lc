package c4lc;

import java.util.regex.Matcher;

import static java.lang.Integer.parseInt;
import static java.util.regex.Pattern.compile;

public class InputParser
{
    public OperatingData parseInput(String input)
    {
        Matcher matcher = compile("^(\\d+)[+\\-*x:/\\\\](\\d+)$").matcher(input);

        if (matcher.find())
        {
            int firstNumber = parseInt(matcher.group(1));
            int secondNumber = parseInt(matcher.group(2));
            char operator = findOperator(input).charAt(0);

            return new OperatingData(firstNumber, secondNumber, operator);
        }

        throw new IllegalArgumentException();
    }

    private String findOperator(String string)
    {
        return string.replaceAll("\\d", "");
    }
}
