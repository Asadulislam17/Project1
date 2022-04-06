package othersresources;
import java.util.Scanner;

import employeedetails.EmployeeInformation;


public class BluePrintForm {

    public static EmployeeInformation fillUp() {
        System.out.println("Fill Up the below form:");

        Scanner scan = new Scanner(System.in);
        System.out.print("Employee Id: ");
        int employeeId = scan.nextInt();

        scan.nextLine();

        System.out.print("Employee Name: ");
        String employeeName = scan.nextLine();

        System.out.print("Department: ");
        String department = scan.nextLine();
        
        System.out.print("Designation: ");
        String designation = scan.nextLine();

        System.out.print("Employee Age: ");
        int employeeAge = scan.nextInt();
        
        System.out.print("Appointment Date: ");
        String appointmentDate = scan.next();

        System.out.print("Contact Number: ");
        String contactNumber = scan.next();
        while(contactNumber.length()!=11) {
        	System.out.print("Contact Number must be 11 digit!!\nContact Number : ");
        	contactNumber = scan.next();
        }
        
        System.out.print("Employee Address: ");
        String employeeAddress = scan.next();

        EmployeeInformation emp = new EmployeeInformation();
        emp.setEmpId(employeeId);
        emp.setEmpName(employeeName);
        emp.setDepartment(department);
        emp.setDesignation(designation);
        emp.setEmpAge(employeeAge);
        emp.setAppointmentDate(appointmentDate);
        emp.setContactNumber(contactNumber);
        emp.setEmpAddress(employeeAddress);

        return emp;
    }
}