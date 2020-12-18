import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest2 {
    private static BankAccount account;
    @BeforeClass
    public static void setObject() {
        account = new BankAccount();
    }
    @Test
    public void TestCorrectDepositFunds() {
        assertEquals(5.5,account.DepositFunds(3),0.1 );
    }
    @Test
    public void TestCorrectWithdrawFunds() {
        assertEquals(0,account.WithdrawFunds(5));
    }
}
