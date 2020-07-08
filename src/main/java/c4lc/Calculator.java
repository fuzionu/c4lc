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
            if (y == 0)
            {
                throw new DividingByZeroException();
            }

            return x / y;
        }
    };

    public int calculate(OperatingData operatingData)
    {
        Operation operation = getOperation(operatingData);

        return operation.calculate(operatingData.firstNumber, operatingData.secondNumber);
    }

    private Operation getOperation(OperatingData operatingData)
    {
        if (operatingData.operator == '+')
        {
            return plus;
        }

        else if (operatingData.operator == '-')
        {
            return minus;
        }

        else if (operatingData.operator == '*' || operatingData.operator == 'x')
        {
            return multiply;
        }

        return divide;
    }
}
