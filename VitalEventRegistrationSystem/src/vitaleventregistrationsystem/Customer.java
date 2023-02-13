
package vitaleventregistrationsystem;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.*;

public class Customer extends Person {

  private String custID;

  private String custName;

  private String category;

  private Account account;
  public Customer(){
      
  }

  public Customer(String name, String fatherName, String grandFatherName, 
                  Date dateOfBirth, String motherName, String motherFatherName, 
                  String region, String subcity, char sex, String custID, 
                  String custName, String category, Account account) {
    super(name, fatherName, grandFatherName, dateOfBirth, motherName, 
          motherFatherName, region, subcity, sex);
    this.custID = custID;
    this.custName = custName;
    this.category = category;
    this.account = account;
  }

  public String getCustID() {
    return custID;
  }

  public void setCustID(String custID) {
    this.custID = custID;
  }

  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }  
  
}
