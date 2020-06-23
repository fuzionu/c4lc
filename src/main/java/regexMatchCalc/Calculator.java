package regexMatchCalc;

public class Calculator
{
    public int calculate(int firstNumber, int secondNumber, char operator)
    {
        if (operator == '+')
        {
            return firstNumber + secondNumber;
        }

        else if (operator == '-')
        {
            return firstNumber - secondNumber;
        }

        else if (operator == '*' || operator == 'x')
        {
            return firstNumber * secondNumber;
        }

        else if (operator == ':' || operator == '/' || operator == '\\')
        {
            return firstNumber / secondNumber;
        }

       throw new IllegalArgumentException();
    }
}
