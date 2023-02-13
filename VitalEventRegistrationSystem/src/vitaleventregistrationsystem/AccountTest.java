
package vitaleventregistrationsystem;

import static org.junit.Assert.*;
import java.util.Date;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AccountTest {
    @Test
    public void testCreateAccount() {
        Account account = new Account();
        Scanner input = new Scanner("test_user\ntest_password\n");
        account.createAccount();
        
        assertEquals("test_user", account.username);
        assertEquals("test_password", account.password);
        assertNotNull(account.dateOfCreation);
        assertNotNull(account.dateOfModification);
    }
    
    @Test
    public void testChangePassword() {
        Account account = new Account();
        Scanner input = new Scanner("new_password\n");
        account.createAccount();
        account.changePassword();
        
        assertEquals("new_password", account.password);
        assertNotNull(account.dateOfModification);
    }
    
    @Test
    public void testModifyAccount() {
        Account account = new Account();
        Scanner input = new Scanner("2\nnew_password\n");
        account.createAccount();
        account.modifyAccount();
        
        assertEquals("new_password", account.password);
        assertNotNull(account.dateOfModification);
    }
    
    @Test
    public void testDeleteAccount() {
        Account account = new Account();
        account.createAccount();
        account.deleteAccount();
        
        assertEquals("", account.username);
        assertEquals("", account.password);
    }
    
    
}