
package vitaleventregistrationsystem;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

  @Test
  public void testDeletePersonData() {
    Person person1 = new Person("John Doe", "Father John", "Grandfather John", new Date(), "Mother Jane", "Mother's Father", "Region", "Subcity", 'M');
    Person person2 = new Person("Jane Doe", "Father Jane", "Grandfather Jane", new Date(), "Mother John", "Mother's Father", "Region", "Subcity", 'F');
    Person.PersonList.add(person1);
    Person.PersonList.add(person2);
    person1.deletePersonData();
    assertEquals(1, Person.PersonList.size());
    assertEquals("Jane Doe", Person.PersonList.get(0).name);
  }

  /*@Test
  public void testUpdateData() {
    Person person1 = new Person("John Doe", "Father John", "Grandfather John", new Date(), "Mother Jane", "Mother's Father", "Region", "Subcity", 'M');
    Person.PersonList.add(person1);
    person1.updateData("Father John Updated", "Mother Jane Updated");
    assertEquals("Father John Updated", Person.PersonList.get(0).fatherName);
    assertEquals("Mother Jane Updated", Person.PersonList.get(0).motherName);
  }*/
 @Test
  public void testGetName() {
    Person person = new Person("John", 'M');
    System.out.println("testing @GetName  " + "John" + " = " + person.getName());
    assertEquals("John", person.getName());
    
  }

  @Test
  public void testSetName() {
    Person person = new Person();
    person.setName("Jane");
    System.out.println("testing @testSetName  " + "Jane" + " = " + person.getName());
    assertEquals("Jane", person.getName());
  }

  @Test
  public void testGetFatherName() {
    Person person = new Person("John", "Doe", "Smith", null, null, null, null, null, 'M');
    System.out.println("testing @testGetFatherName  " + "Doe" + " = " + person.getFatherName());
    assertEquals("Doe", person.getFatherName());
  }

  @Test
  public void testSetFatherName() {
    Person person = new Person();
    person.setFatherName("Brown");
    assertEquals("Brown", person.getFatherName());
  }

  @Test
  public void testGetGrandFatherName() {
    Person person = new Person("John", "Doe", "Smith", null, null, null, null, null, 'M');
    System.out.println("testing @testGetGrandFatherName  " + "Smith" + " = " + person.getGrandFatherName());
    assertEquals("Smith", person.getGrandFatherName());
  }

  @Test
  public void testSetGrandFatherName() {
    Person person = new Person();
    person.setGrandFatherName("Johnson");
    assertEquals("Johnson", person.getGrandFatherName());
  }

  @Test
  public void testGetMotherName() {
    Person person = new Person("John", "Doe", "Smith", null, "Jane", "Doe", null, null, 'M');
    assertEquals("Jane", person.getMotherName());
  }

  @Test
  public void testSetMotherName() {
    Person person = new Person();
    person.setMotherName("Emma");
    assertEquals("Emma", person.getMotherName());
  }

}
