package employeedetails;

import othersresources.SystemServices;

public class EmployeeDetailsMsg extends SystemServices{

    // Greetings message
    @Override
    public void wellcome_msg()
    {
        System.out.println("\nWelcome to Our Employee Services !!!");
    }

    // Ending message
    @Override
    public void stop_msg()
    {
        System.out.println("End Employee Services");
    }

    // Employee Services
    @Override
    public void service_info()
    {
        System.out.println(
                "\nEmployee Services: \n" +
                "# 1 Create\n" +
                "# 2 Read\n" +
                "# 3 Update\n" +
                "# 4 Delete\n" +
                "# 5 All Employee Info\n" +
                "# 0 Stop\n"
        );
    }
}