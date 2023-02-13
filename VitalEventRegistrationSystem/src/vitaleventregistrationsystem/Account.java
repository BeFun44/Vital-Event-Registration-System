
package vitaleventregistrationsystem;


import java.util.Date;
import java.util.Scanner;


import java.util.Date;
import java.util.Scanner;

public class Account {

  public String username;

  public String password;

  public Date dateOfModification;

  public Date dateOfCreation;
  
  public Account(){
      
  }

  public Account(String username, String password, Date dateOfModification, Date dateOfCreation, String category) {
    this.username = username;
    this.password = password;
    this.dateOfModification = dateOfModification;
    this.dateOfCreation = dateOfCreation;
  }

 public void createAccount() {
    // Get user input for username and password
    Scanner input = new Scanner(System.in);
    System.out.print("Enter username: ");
    this.username = input.nextLine();
    System.out.print("Enter password: ");
    this.password = input.nextLine();

    // Set the date of creation to the current date
    this.dateOfCreation = new Date();
    this.dateOfModification = this.dateOfCreation;

    System.out.println("Account created successfully!");
}
  
   public void changePassword() {
    // Get user input for the new password
    Scanner input = new Scanner(System.in);
    System.out.print("Enter new password: ");
    this.password = input.nextLine();

    // Update the date of modification to the current date
    this.dateOfModification = new Date();

    System.out.println("Password changed successfully!");
}
  
    public void deleteAccount() {
    // Reset the username and password
    this.username = "";
    this.password = "";

    System.out.println("Account deleted successfully!");
}
    
    public void modifyAccount() {
    Scanner input = new Scanner(System.in);
    System.out.println("What would you like to modify?");
    System.out.println("1. Username");
    System.out.println("2. Password");
    int choice = input.nextInt();

    switch (choice) {
        case 1:
            System.out.print("Enter new username: ");
            this.username = input.nextLine();
            break;
        case 2:
            System.out.print("Enter new password: ");
            this.password = input.nextLine();
            break;
        default:
            System.out.println("Invalid choice. No modifications made.");
            return;
    }

    // Update the date of modification to the current date
    this.dateOfModification = new Date();

    System.out.println("Account modified successfully!");
}

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Date getDateOfModification() {
    return dateOfModification;
  }

  public void setDateOfModification(Date dateOfModification) {
    this.dateOfModification = dateOfModification;
  }

  public Date getDateOfCreation() {
    return dateOfCreation;
  }

  public void setDateOfCreation(Date dateOfCreation) {
    this.dateOfCreation = dateOfCreation;
  }
  
}