package othersresources;
import java.util.ArrayList;

import studentdetails.StudentInformation;


public class CSUDAllServices {

    // create | post
    public static void create(StudentInformation st, ArrayList<StudentInformation> db)
    {
        for (StudentInformation student: db)
        {
            if (student.getId() == st.getId())
            {
                System.out.println("Id already exist");
                return;
            }
        }
        db.add(st);
        System.out.println("Successfully added.");
    }

    // read | get
    public static void filterById(int id, ArrayList<StudentInformation> db)
    {
        for (StudentInformation st: db)
        {
            if (st.getId() == id)
            {
                System.out.println("Student Information:");
                System.out.println("Id              : " + st.getId());
                System.out.println("Name            : " + st.getName());
                System.out.println("Age             : " + st.getAge());
                System.out.println("Department      : " + st.getDepartment());
                System.out.println("Admission Year  : " + st.getAdmissionYear());
                System.out.println("Contect         : " + st.getContact());
                System.out.println("Address         : " + st.getAddress());
                return;
            }
        }
        System.out.println("Student Information Not Found in Database.");
    }

    // update
    public static void update(StudentInformation st, ArrayList<StudentInformation> db)
    {
        int update_index = 0;
        for (StudentInformation student: db)
        {
            if (student.getId() == st.getId())
            {
            	System.out.println("Student Information:");
            	System.out.println("Id              : " + st.getId());
                System.out.println("Name            : " + st.getName());
                System.out.println("Age             : " + st.getAge());
                System.out.println("Department      : " + st.getDepartment());
                System.out.println("Admission Year  : " + st.getAdmissionYear());
                System.out.println("Contect         : " + st.getContact());
                System.out.println("Address         : " + st.getAddress());
                db.remove(update_index);
                db.add(st);
                System.out.println("Successfully added.");
                return;
            }
            update_index ++;
        }
        //System.out.println("Information Not Found in Database");
    }

    // delete
    public static void delete(int id, ArrayList<StudentInformation> db)
    {
        int item_index = 0;
        for (StudentInformation st: db)
        {
            if (st.getId() == id) {
                db.remove(item_index);
                return;
            }
            item_index ++;
        }
        System.out.println("Item Not Found in Database");
    }
    
 // All Data Read
    public static void studentAllDataRead(ArrayList<StudentInformation> db){
    	
        for (StudentInformation student: db)
        {
        	System.out.println("Student Information:");
        	System.out.println("Id              : " + student.getId());
            System.out.println("Name            : " + student.getName());
            System.out.println("Age             : " + student.getAge());
            System.out.println("Department      : " + student.getDepartment());
            System.out.println("Admission Year  : " + student.getAdmissionYear());
            System.out.println("Contect         : " + student.getContact());
            System.out.println("Address         : " + student.getAddress());
        }
        System.out.println("Information Not Found in Database");
    }
}