package regexMatchCalc;

public class Calculator
{
    public int calculate(OperatingData operatingData)
    {
        if (operatingData.operator == '+')
        {
            return operatingData.firstNumber + operatingData.secondNumber;
        }

        else if (operatingData.operator == '-')
        {
            return operatingData.firstNumber - operatingData.secondNumber;
        }

        else if (operatingData.operator == '*' || operatingData.operator == 'x')
        {
            return operatingData.firstNumber * operatingData.secondNumber;
        }

        else if (operatingData.operator == ':' || operatingData.operator == '/' || operatingData.operator == '\\')
        {
            return operatingData.firstNumber / operatingData.secondNumber;
        }

       throw new IllegalArgumentException();
    }
}
