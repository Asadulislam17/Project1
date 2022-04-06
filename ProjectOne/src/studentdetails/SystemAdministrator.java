package studentdetails;

import java.util.Scanner;
import java.util.ArrayList;

import calculator.AddAndSubCalculator;
import calculator.AdvancedCalculator;
import calculator.CalculatorInfoMsg;
import othersresources.BluePrintForm;
import othersresources.CSUDAllServices;
import othersresources.SystemServices;
import studentdetails.StudentInformation;

public class SystemAdministrator {
	
    // main function
    public static void main(String[] args) {
    	
    	// My Database
        ArrayList<StudentInformation> Database = new ArrayList<>();
        
        int option;
        int operation;

        SystemServices ss;
        ss = new StudentDetailsMsg();

        SystemServices cs;
        cs = new CalculatorInfoMsg();
        
        AddAndSubCalculator obj = new AdvancedCalculator();

        while(true)
        {
            System.out.println("\n\nWelcome to our Student Admission Management System !!!\n");
            System.out.println("1. Student Services");
            System.out.println("2. Calculator Services");
            System.out.println("0. Terminate\n");

            Scanner input = new Scanner(System.in);

            System.out.print("Enter Option: ");
            option = input.nextInt();

            if (option == 0) {
            	break;
            }

            else if (option == 1)
            {
                ss.wellcome_msg();
                while (true)
                {
                    ss.service_info();
                    System.out.print("Enter Operation: ");
                    operation = input.nextInt();

                    if (operation == 0)
                        break;

                    // create | read | update | delete
                    switch (operation)
                    {
                    // create
                        case 1:
                        {
                            StudentInformation std = BluePrintForm.fillUp();
                            CSUDAllServices.create(std, Database);
                            break;
                        }
                        
                        // read
                        case 2:
                        {
                            System.out.print("Search Id: ");
                            int search_id = input.nextInt();
                            CSUDAllServices.filterById(search_id, Database);
                            break;
                        }
                        
                        // update
                        case 3:
                        {
                            System.out.print("Update through id: ");
                            int search_id = input.nextInt();
                            CSUDAllServices.filterById(search_id, Database);
                            System.out.println();
                            StudentInformation update_std = BluePrintForm.fillUp();
                            CSUDAllServices.update(update_std, Database);
                            break;
                        }
                        
                        // delete
                        case 4:
                        {
                            System.out.print("Delete Id: ");
                            int delete_id = input.nextInt();
                            CSUDAllServices.delete(delete_id, Database);
                            break;
                        }
                        
                     // Student All Data Read
                        case 5:
                        {
                            CSUDAllServices.studentAllDataRead(Database);
                            break;
                        }
                        
                        default:
                            System.out.println("Invalid Operation");
                    }
                }
                ss.stop_msg();
            }
			 else if (option == 2) {
				 
				 cs.wellcome_msg();
				 
				 while (true) {
					 double num1, num2;
					 int a, b;
				  
					  cs.service_info(); System.out.print("Enter Operation: ");
					  operation =
					  input.nextInt();
					  
					  if (operation == 0) break;
					  
					  // addition | subtraction | multiplication | division
					  switch (operation) {
						  	case 1: {
						  		
						  		//addition
						  		
						  		System.out.print("Enter your 1st value: ");
						  		int number1 = input.nextInt();
						  		
						  		System.out.print("Enter your 2nd value: "); 
						  		int number2 =  input.nextInt();
						  		
						  		System.out.print("Enter your 3rd value: "); 
						  		int number3 =  input.nextInt();
						  		
						  		obj.add(number1, number2, number3);
						  		
						  		break;
					  		}
						  	case 2: {
						  		//subtraction
						  		
								System.out.print("Enter your 1st value: ");
								a = input.nextInt();
						  		
								System.out.print("Enter your 2nd value: ");
							    b = input.nextInt();
							    obj.sub(a, b);
							    
							    break;
						  	}
					  	
					  	 case 3: {
					  		  // multiplication
					  		 
							  System.out.print("Enter your 1st value: ");
							  a = input.nextInt();
							  
							  System.out.print("Enter your 2nd value: ");
							  b = input.nextInt();
							  
							  AdvancedCalculator.multiply(a, b);
							  
							  break;
						  }
						  	  case 4: {
					  		  // division
							  System.out.print("Enter your 1st value: ");
							  num1 = input.nextInt();
							  
							  System.out.print("Enter your 2nd value: ");
							  num2 = input.nextInt();
							  
							  AdvancedCalculator.div(num1, num2);
							  
							  break;
						  }
					  	  default:
					  		  System.out.println("Invalid Operation");
					  } 
				  } 
				 cs.stop_msg();
			  }
			 else {
				 System.out.println("Invalid Options");
			 }
        }
    }
}