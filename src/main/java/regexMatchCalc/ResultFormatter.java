package regexMatchCalc;

public class ResultFormatter
{
    public String formatResult(OperatingData operatingData)
    {
        return operatingData.firstNumber + " " + parseOperator(operatingData) + " " + operatingData.secondNumber + " = " ;
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
