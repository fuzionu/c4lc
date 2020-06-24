package regexMatchCalc;

public class ResultFormatter
{
    private final Calculator calculator = new Calculator();

    public String formatResult(OperatingData operatingData)
    {
        int result = calculator.calculate(operatingData);

        return operatingData.firstNumber + " " + parseOperator(operatingData) + " " + operatingData.secondNumber + " = " + result;
    }

    private char parseOperator(OperatingData operatingData)
    {
        if (operatingData.operator == '*')
        {
            return 'x';
        }

        if (operatingData.operator == '\\' || operatingData.operator == '/')
        {
            return ':';
        }

        return operatingData.operator;
    }
}
