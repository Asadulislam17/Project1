package othersresources;
import java.util.Scanner;

import studentdetails.StudentInformation;


public class BluePrintForm {

    public static StudentInformation fillUp() {
        System.out.println("Fill Up the below form:");

        Scanner scan = new Scanner(System.in);
        System.out.print("Id: ");
        int id = scan.nextInt();

        scan.nextLine();

        System.out.print("Name: ");
        String name = scan.nextLine();

        System.out.print("Department: ");
        String dept = scan.nextLine();

        System.out.print("Age: ");
        int age = scan.nextInt();

        System.out.print("Admission Year: ");
        int admissionYear = scan.nextInt();

        System.out.print("Contact: ");
        String contact = scan.next();
        while(contact.length()!=11) {
        	System.out.print("Contact must be 11 digit!!\nContact : ");
            contact = scan.next();
        }
        
        System.out.print("Address: ");
        String address = scan.next();

        StudentInformation std = new StudentInformation();
        std.setId(id);
        std.setName(name);
        std.setDepartment(dept);
        std.setAge(age);
        std.setAdmissionYear(admissionYear);
        std.setContact(contact);
        std.setAddress(address);

        return std;
    }
}