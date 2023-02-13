
package vitaleventregistrationsystem;

import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class Registrant extends Person {

  private String eventRegistrationNumber;

  private Date dateOfRegistration;
  
  public Registrant() {
      
  }

  public Registrant(String name, String fatherName, String grandFatherName, 
                    Date dateOfBirth, String motherName, String motherFatherName, 
                    String region, String subcity, char sex, 
                    String eventRegistrationNumber, Date dateOfRegistration) {
    super(name, fatherName, grandFatherName, dateOfBirth, motherName, 
          motherFatherName, region, subcity, sex);
    this.eventRegistrationNumber = eventRegistrationNumber;
    this.dateOfRegistration = dateOfRegistration;
  }

  public String getEventRegistrationNumber() {
    return eventRegistrationNumber;
  }

  public void setEventRegistrationNumber(String eventRegistrationNumber) {
    this.eventRegistrationNumber = eventRegistrationNumber;
  }

  public Date getDateOfRegistration() {
    return dateOfRegistration;
  }

  public void setDateOfRegistration(Date dateOfRegistration) {
    this.dateOfRegistration = dateOfRegistration;
  }
  
  public int Add() {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter Event Registration Number: ");
      this.eventRegistrationNumber = sc.nextLine();

      System.out.print("Enter Date of Registration (yyyy-MM-dd): ");
      String dateStr = sc.nextLine();
      this.dateOfRegistration = dateOfRegistration;

      return 0;
  }
}

