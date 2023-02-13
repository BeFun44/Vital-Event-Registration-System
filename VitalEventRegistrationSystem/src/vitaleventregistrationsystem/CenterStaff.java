
package vitaleventregistrationsystem;


import java.util.Date;


import java.util.Date;

import java.util.*;

public class CenterStaff extends Person {

  private String empID;

  private String workingCenterName;

  private Account account;
  public CenterStaff(){
    
}
  public CenterStaff(String name, String fatherName, String grandFatherName, 
                     Date dateOfBirth, String motherName, String motherFatherName, 
                     String region, String subcity, char sex, String empID, 
                     String workingCenterName, Account account) {
    super(name, fatherName, grandFatherName, dateOfBirth, motherName, 
          motherFatherName, region, subcity, sex);
    this.empID = empID;
    this.workingCenterName = workingCenterName;
    this.account = account;
  }

  public String getEmpID() {
    return empID;
  }

  public void setEmpID(String empID) {
    this.empID = empID;
  }

  public String getWorkingCenterName() {
    return workingCenterName;
  }

  public void setWorkingCenterName(String workingCenterName) {
    this.workingCenterName = workingCenterName;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public void addEmpData() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Employee ID: ");
    this.empID = input.nextLine();
    System.out.print("Enter the Working Center Name: ");
    this.workingCenterName = input.nextLine();
    System.out.print("\n");
  }

}

