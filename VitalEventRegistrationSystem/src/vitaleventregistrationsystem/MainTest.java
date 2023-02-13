
package vitaleventregistrationsystem;


//this is to run and test test classes
public class MainTest {
    public static void main(String [] args){
       
        PersonTest test = new PersonTest();
        
        
       test.testGetName();
       test.testSetName();
      //test.testDeletePersonData();
      test.testGetFatherName();
      test.testGetGrandFatherName();
      test.testSetMotherName();
      
      AccountTest account = new AccountTest();
        account.testDeleteAccount();
        account.testModifyAccount();
    }
    
}
