package c4lc;

import java.util.Scanner;

public class TextInterface
{
    private final Scanner scanner;
    private final InputParser inputParser = new InputParser();
    private final ResultFormatter resultFormatter = new ResultFormatter();
    private final Calculator calculator = new Calculator();

    public TextInterface(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public void start()
    {
        printWelcomeMessage();

        do
        {
            OperatingData operatingData;
            int result;

            System.out.print("> ");
            String input = formatInput(scanner.nextLine());

            if (input.isEmpty())
            {
                continue;
            }

            if (input.equals("exit"))
            {
                System.out.println("Closing...");
                break;
            }


            try
            {
                operatingData = inputParser.parseInput(input);
            }
            catch (IllegalArgumentException exc)
            {
                System.out.println("Wrong input. Type again.");
                continue;
            }

            try
            {
                result = calculator.calculate(operatingData);
            }
            catch (DividingByZeroException exc)
            {
                System.out.println("Dividing by zero is not allowed. Type again.");
                continue;
            }

            System.out.println(resultFormatter.formatResult(operatingData) + result);
            printWelcomeMessage();

        } while (true);
    }

    private String formatInput(String input)
    {
        return input.replaceAll(" ", "").toLowerCase();
    }

    private void printWelcomeMessage()
    {
        System.out.print("\nRegex match calculator.\n" +
                "Type `number` [operator: +, -, *, x, :, \\, /] `number`\n" +
                "Or type `exit` to close the program.\n");
    }
}
