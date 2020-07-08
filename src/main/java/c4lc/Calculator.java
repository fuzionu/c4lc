package c4lc;

public class Calculator
{


    public static Operation plus = new Operation()
    {
        @Override
        public int calculate(int x, int y)
        {
            return x + y;
        }
    };

    public static Operation minus = new Operation()
    {
        @Override
        public int calculate(int x, int y)
        {
            return x - y;
        }
    };

    public static Operation multiply = new Operation()
    {
        @Override
        public int calculate(int x, int y)
        {
            return x * y;
        }
    };

    public static Operation divide = new Operation()
    {
        @Override
        public int calculate(int x, int y)
        {
            return x / y;
        }
    };

    public int calculate(OperatingData operatingData)
    {
        if (operatingData.operator == '+')
        {
            return plus.calculate(operatingData.firstNumber, operatingData.secondNumber);
        }

        else if (operatingData.operator == '-')
        {
            return minus.calculate(operatingData.firstNumber, operatingData.secondNumber);
        }

        else if (operatingData.operator == '*' || operatingData.operator == 'x')
        {
            return multiply.calculate(operatingData.firstNumber, operatingData.secondNumber);
        }

        else if (operatingData.operator == ':' || operatingData.operator == '/' || operatingData.operator == '\\')
        {
            if (operatingData.secondNumber == 0)
            {
                throw new DividingByZeroException();
            }

            return divide.calculate(operatingData.firstNumber, operatingData.secondNumber);
        }

       throw new IllegalArgumentException();
    }
}
