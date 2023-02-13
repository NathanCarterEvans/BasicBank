import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        UserManager.CLEARACCOUNTS();
    }


    @Test
    public void testMakeUser(){
        assertEquals(0, UserManager.MakeNewUser());
        assertEquals(1, UserManager.getCurrentIndexForBasicUseres());

        UserManager.MakeNewUser();
        UserManager.MakeNewUser();
        UserManager.MakeNewUser();
        assertEquals(4, UserManager.getCurrentIndexForBasicUseres());
    }

    @Test
    public void testUserID(){
        UserManager.MakeNewUser();
        Account a = UserManager.getAccountFromID(0);
        assertEquals(0,a.GetUserID());
    }

    @Test
    public void testBankCreateNewUser(){
        Bank.CreateNewUser("John_Doe1","pass", 1111);
        Account a = UserManager.getAccountFromID(0);
        assertEquals(0,a.GetUserID());

    }

    @Test
    public void testPasswordHash(){
        Bank.CreateNewUser("John_Doe1","pass", 1111);
        Account a = UserManager.getAccountFromID(0);
        assertEquals(true, a.getPasswordHash(PasswordEncryption.Encrypt("pass")));

    }
}
