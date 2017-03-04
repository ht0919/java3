import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
    // 実際にAccountをnewして使ってみるテスト
    @Test public void intstantiate() {
        Account a = new Account("ミナト", 30000);
        assertEquals("ミナト", a.owner);
        assertEquals(30000, a.balance);
    }
    @Test public void transfer() {
      Account a = new Account("ミナト", 30000);
      Account b = new Account("スズキ", 10000);
      a.transfer(b,10000);
      assertEquals(20000, a.balance);
      assertEquals(20000, b.balance);
    }
}
