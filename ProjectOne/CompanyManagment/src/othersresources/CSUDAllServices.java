package othersresources;
import java.util.ArrayList;

import employeedetails.EmployeeInformation;


public class CSUDAllServices {

    // create | poemp
    public static void create(EmployeeInformation emp, ArrayList<EmployeeInformation> db)
    {
        for (EmployeeInformation emp1: db)
        {
            if (emp.getEmpId() == emp.getEmpId())
            {
                System.out.println("Id already exiemp");
                return;
            }
        }
        db.add(emp);
        System.out.println("Successfully added.");
    }

    // read | get
    public static void filterById(int id, ArrayList<EmployeeInformation> db)
    {
        for (EmployeeInformation emp: db)
        {
            if (emp.getEmpId() == id)
            {
            	System.out.println("Employee Information:");
            	System.out.println("Id              : " + emp.getEmpId());
                System.out.println("Name            : " + emp.getEmpName());
                System.out.println("Department      : " + emp.getDepartment());
                System.out.println("Designation     : " + emp.getDesignation());
                System.out.println("Age             : " + emp.getEmpAge());
                System.out.println("AppointmentDate : " + emp.getAppointmentDate());
                System.out.println("Contect         : " + emp.getContactNumber());
                System.out.println("Address         : " + emp.getEmpAddress());
                return;
            }
        }
        System.out.println("emp Information Not Found in Database.");
    }

    // update
    public static void update(EmployeeInformation emp, ArrayList<EmployeeInformation> db)
    {
        int update_index = 0;
        for (EmployeeInformation emp1: db)
        {
            if (emp.getEmpId() == emp.getEmpId())
            {
            	System.out.println("Employee Information:");
            	System.out.println("Id              : " + emp.getEmpId());
                System.out.println("Name            : " + emp.getEmpName());
                System.out.println("Department      : " + emp.getDepartment());
                System.out.println("Designation     : " + emp.getDesignation());
                System.out.println("Age             : " + emp.getEmpAge());
                System.out.println("AppointmentDate : " + emp.getAppointmentDate());
                System.out.println("Contect         : " + emp.getContactNumber());
                System.out.println("Address         : " + emp.getEmpAddress());
                db.remove(update_index);
                db.add(emp);
                return;
            }
            update_index ++;
        }
        System.out.println("Information Not Found in Database");
    }

    // delete
    public static void delete(int id, ArrayList<EmployeeInformation> db)
    {
        int item_index = 0;
        for (EmployeeInformation emp: db)
        {
            if (emp.getEmpId() == id) {
                db.remove(item_index);
                return;
            }
            item_index ++;
        }
        System.out.println("Item Not Found in Database");
    }
    
 // All Data Read
    public static void employeeAllDataRead(ArrayList<EmployeeInformation> db){
    	
        for (EmployeeInformation emp: db)
        {
        	System.out.println("Employee Information:");
        	System.out.println("Id              : " + emp.getEmpId());
            System.out.println("Name            : " + emp.getEmpName());
            System.out.println("Department      : " + emp.getDepartment());
            System.out.println("Designation     : " + emp.getDesignation());
            System.out.println("Age             : " + emp.getEmpAge());
            System.out.println("AppointmentDate : " + emp.getAppointmentDate());
            System.out.println("Contect         : " + emp.getContactNumber());
            System.out.println("Address         : " + emp.getEmpAddress());
        }
        System.out.println("Information Not Found in Database");
    }
}