package calculator;

import othersresources.SystemServices;

public class CalculatorInfoMsg extends SystemServices {
	// Greetings message
    @Override
    public void wellcome_msg()
    {
        System.out.println("\nWelcome To Our Calculator Services !!!");
    }

    // Ending message
    @Override
    public void stop_msg()
    {
        System.out.println("Stop Calculator Services");
    }

    // Student Services
    @Override
    public void service_info()
    {
        System.out.println(
                "\nCalculator Services: \n" +
                "# 1 Summation\n" +
                "# 2 Subtraction\n" +
                "# 3 Multiplication\n" +
                "# 4 Division\n" +
                "# 0 Terminate\n"
        );
    }
}
