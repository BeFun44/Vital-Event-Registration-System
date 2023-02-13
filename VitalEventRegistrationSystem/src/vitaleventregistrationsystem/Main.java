
package vitaleventregistrationsystem;


import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Person person = new Person();
        Customer customer = new Customer();
        Registrant registrant = new Registrant();
        CenterStaff staff = new CenterStaff();
        Account account = new Account("username", "password", new Date(), new Date(), "category");
        CenterStaff centerStaff = new CenterStaff("Name", "FatherName", "GrandFatherName", new Date(), 
                            "MotherName", "MotherFatherName", "Region", "Subcity", 'M', 
                            "123", "WorkingCenterName", account);
       System.out.println("\n\n ########################################################################\n");
       System.out.println("\t\tWELLCOME TO VITAL EVENT REGISTRATION SYSTEM");
       System.out.println("\n\n ########################################################################\n");
        
        while (true) {
            System.out.println("1. Record Person Data");
            System.out.println("2. View Person Record");
            System.out.println("3. Delete Person Record");
            System.out.println("4. Update Person Record");
            System.out.println("5. Create Account");
            System.out.println("6. Change Password");
            System.out.println("7. Update Account");
            System.out.println("9. Add Registrant");
            System.out.println("10. Add Staff member");
            System.out.println("11. Exit");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    person.addPersonData();
                    break;
                case 2:
                    person.viewData();
                    break;
                
                case 3:
                    person.deletePersonData();
                    break;
                case 4:
                    person.updateData();
                    break;
               case 5:
                    account.createAccount();
                    System.out.println("Username : Password");
                    System.out.println(account.getUsername() + " : " + account.getPassword());
                    break;
                case 6:
                    account.changePassword();
                    break;
                
                case 7:
                    account.modifyAccount();
                    break;
                case 8:
                    account.deleteAccount();
                    break;
                case 9:
                    registrant.Add();
                    System.out.println("Event Registration Number: " + registrant.getEventRegistrationNumber() + "\n" + "Date Of Registration: " + registrant.getDateOfRegistration());
                    System.out.println("\n");
                    break;
                case 10:
                    staff.addEmpData();
                    System.out.println("Employee ID: " + staff.getEmpID() + "\n" + "Working Center Name: " + staff.getWorkingCenterName());
                    break;
                case 11:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
