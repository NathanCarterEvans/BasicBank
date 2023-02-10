import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import junit.*;

public class BankTest {
    Account a;

    @Before
    public void setup(){
        a = new Account();
    }

    @Test
    public void testBasic(){
        assertEquals(1, a.GetUsertID());
    }
}
