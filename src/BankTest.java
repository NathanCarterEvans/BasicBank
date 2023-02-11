import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankTest {


    @Test
    public void testMakeUser(){
        UserManager.CLEARACCOUNTS();
        assertEquals(0, UserManager.MakeNewUser());
        assertEquals(1, UserManager.getCurrentIndexForBasicUseres());

        UserManager.MakeNewUser();
        UserManager.MakeNewUser();
        UserManager.MakeNewUser();
        assertEquals(4, UserManager.getCurrentIndexForBasicUseres());
    }

    @Test
    public void testUserID(){
        UserManager.CLEARACCOUNTS();
        UserManager.MakeNewUser();
        Account a = UserManager.getAccountFromID(0);
        assertEquals(0,a.GetUserID());
    }

    @Test
    public void testBankCreateNewUser(){
        UserManager.CLEARACCOUNTS();
        Bank.CreateNewUser("John_Doe1", 1111);
        Account a = UserManager.getAccountFromID(0);
        assertEquals(0,a.GetUserID());

    }
}
