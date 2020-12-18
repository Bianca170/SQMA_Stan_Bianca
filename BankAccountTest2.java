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
        assertEquals(4.5,account.DepositFunds(2),0.1 );
    }
    @Test
    public void TestCorrectWithdrawFunds() {
        assertEquals(0.0,account.WithdrawFunds(7),0.1);
    }
}
