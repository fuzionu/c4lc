package regexMatchCalc;

import java.util.Scanner;

public class TextInterface
{
    private final Scanner scanner;
    private final InputConverter inputConverter = new InputConverter();
    private final ResultFormatter resultFormatter = new ResultFormatter();
    private OperatingData operatingData;

    public TextInterface(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public void start()
    {
        printWelcomeMessage();

        do
        {
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
                operatingData = inputConverter.convertInput(input);
            }
            catch (IllegalArgumentException exc)
            {
                System.out.println("Wrong input. Type again.");
                continue;
            }

            try
            {
                System.out.println(resultFormatter.formatResult(operatingData));
                printWelcomeMessage();
            }
            catch (DividingByZeroException exc)
            {
                System.out.println("Dividing by zero is not allowed. Type again.");
            }

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
