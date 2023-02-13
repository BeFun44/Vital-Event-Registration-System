
package vitaleventregistrationsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Person {

  public String name;

  public String fatherName;

  public String grandFatherName;

  public Date dateOfBirth;

  public String motherName;

  public String motherFatherName;

  public String region;

  public String subcity;
static ArrayList<Person> PersonList = new ArrayList<Person>(0);
  public char sex;
  public Person(){
      
  }
  public Person(String name, char sex){
      this.name = name;
      this.sex = sex;
  }
  public Person(String name, String fatherName, String grandFatherName, Date dateOfBirth,
                String motherName, String motherFatherName, String region, String subcity, char sex) {
    this.name = name;
    this.fatherName = fatherName;
    this.grandFatherName = grandFatherName;
    this.dateOfBirth = dateOfBirth;
    this.motherName = motherName;
    this.motherFatherName = motherFatherName;
    this.region = region;
    this.subcity = subcity;
    this.sex = sex;
  }
public Person(String name, String region, String subcity, char sex) {
    this.name = name;
    this.region = region;
    this.subcity = subcity;
    this.sex = sex;
  }

public Person(String fatherName, String motherName) {
    this.fatherName = fatherName;
    this.motherName = motherName;
  }
    
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public String getGrandFatherName() {
    return grandFatherName;
  }

  public void setGrandFatherName(String grandFatherName) {
    this.grandFatherName = grandFatherName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  public String getMotherFatherName() {
    return motherFatherName;
  }

  public void setMotherFatherName(String motherFatherName) {
    this.motherFatherName = motherFatherName;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getSubcity() {
    return subcity;
  }

  public void setSubcity(String subcity) {
    this.subcity = subcity;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }
  
  // Implementation for adding person data to the system
    public static ArrayList<Person> addPersonData() {
  // Get the person data from the user
  String option;
  Scanner scan = new Scanner(System.in);
  do{
  System.out.print("Enter name: ");
  String name = scan.nextLine();
  System.out.print("Enter father name: ");
  String fatherName = scan.nextLine();
  System.out.print("Enter grandfather name: ");
  String grandFatherName = scan.nextLine();
  System.out.print("Enter date of birth (yyyy-MM-dd): ");
  String dateOfBirthStr = scan.nextLine();
  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
  Date dateOfBirth;
  try {
     dateOfBirth = formatter.parse(dateOfBirthStr);
  
  System.out.print("Enter mother name: ");
  String motherName = scan.nextLine();
  System.out.print("Enter mother father name: ");
  String motherFatherName = scan.nextLine();
  System.out.print("Enter region: ");
  String region = scan.nextLine();
  System.out.print("Enter subcity: ");
  String subcity = scan.nextLine();
  System.out.print("Enter sex (M/F): ");
  String sexStr = scan.nextLine();
  char sex = sexStr.charAt(0);
  Person person = new Person( name,  fatherName,  grandFatherName, dateOfBirth,
                 motherName,  motherFatherName,  region,  subcity,  sex);
  PersonList.add(person);
  } catch (ParseException e) {
    e.printStackTrace();
  }
  System.out.println("Do you want to continue enter y/n");
  option = scan.nextLine();
  }while(option.equalsIgnoreCase("y"));
  // Return success status
  return PersonList;
}
    
    public static void  viewData (){
        
    if(PersonList.size()!= 0)
        for(int  i = 0; i < PersonList.size(); i++){
        System.out.println("Name: " + PersonList.get(i).name);
        System.out.println("Father's Name: " + PersonList.get(i).fatherName);
        System.out.println("GrandFather's Name: " + PersonList.get(i).grandFatherName);
        System.out.println("Date of Birth: " + PersonList.get(i).dateOfBirth);
        System.out.println("Mother's Name: " + PersonList.get(i).motherName);
        System.out.println("Mother's Father's Name: " + PersonList.get(i).motherFatherName);
        System.out.println("Region: " + PersonList.get(i).region);
        System.out.println("Subcity: " + PersonList.get(i).subcity);
        System.out.println("Sex: " + PersonList.get(i).sex);
        }
    else
        System.out.println("There is no record");
  }
  
  

  public void deletePersonData() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the name of the person whose record you want to delete: ");
    String nameToDelete = sc.nextLine();
    if(PersonList != null)
        for(int  i = 0; i < PersonList.size(); i++)
            if(PersonList.get(i).name.equalsIgnoreCase(nameToDelete)){
             PersonList.remove(PersonList.get(i)); 
        
        System.out.println("Record deleted successfully.");
    } else {
        System.out.println("No record found for " + nameToDelete + ".");
    }

  }

  public static void updateData() {
    Scanner sc = new Scanner(System.in);
    Person person = new Person();
    System.out.print("Enter the name of the person whose record you want to update: ");
    String nameToUpdate = sc.nextLine();
    if(PersonList.size()!= 0)
        for(int  i = 0; i < PersonList.size(); i++){
            if(PersonList.get(i).name.equalsIgnoreCase(nameToUpdate)){
                System.out.println("Updating record for " + PersonList.get(i).name + "...");
                System.out.print("Enter the updated name: ");
                PersonList.get(i).name = sc.nextLine();
                System.out.print("Enter the updated father's name: ");
                PersonList.get(i).fatherName = sc.nextLine();
                System.out.print("Enter the updated grandfather's name: ");
                PersonList.get(i).grandFatherName = sc.nextLine();
                System.out.print("Enter the updated date of birth (dd/mm/yyyy): ");
                String dobString = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    PersonList.get(i).dateOfBirth = sdf.parse(dobString);
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please enter the date in the format dd/mm/yyyy.");
                }
                System.out.print("Enter the updated mother's name: ");
                PersonList.get(i).motherName = sc.nextLine();
                System.out.print("Enter the updated mother's father's name: ");
                PersonList.get(i).motherFatherName = sc.nextLine();
                System.out.print("Enter the updated region: ");
                PersonList.get(i).region = sc.nextLine();
                System.out.print("Enter the updated subcity: ");
                PersonList.get(i).subcity = sc.nextLine();
                System.out.print("Enter the updated sex (M/F): ");
                String sexString = sc.nextLine();
                if (sexString.equals("M")) {
                    PersonList.get(i).sex = 'M';
                } else if (sexString.equals("F")) {
                    PersonList.get(i).sex = 'F';
                } else {
                    System.out.println("Invalid sex. Please enter either M or F.");
                }
                System.out.println("Record updated successfully.");
            }
            else {
                System.out.println("No record found for " + nameToUpdate + ".");
        }
     }
  }
}

