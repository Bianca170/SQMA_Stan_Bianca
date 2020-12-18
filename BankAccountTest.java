package Tests;

import com.BankAccount;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    private static BankAccount account;
    @BeforeClass
    public static void setObject() {
        account = new BankAccount();
    }
    @Test
    public void TestCorrectAccountNumber() {
        assertEquals("54321", account.getAccountNumber());
    }
    @Test
    public void TestCorrectBalance() {
        assertEquals(2.5,account.getBalance(),0.1);
    }
}