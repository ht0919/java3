import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
  //
  @Test public void setName() {
    Bank b = new Bank();
    b.setName("ミヤビ");
  }
  //
  @Test public void setNameWithNull() {
    try {
      Bank b = new Bank();
      b.setName(null);
    } catch (NullPointerException e) {
      return;
    }
    fail();
  }
  //
  @Test(expected = IllegalArgumentException.class)
  public void throwsExceptionWithTwoCharName() {
    Bank b = new Bank();
    b.setName("ミヤ");
  }
}
