import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanToArabicTest {

  @Test
  public void calculateReturns1forI() {
      RomanToArabic romanToArabic = new RomanToArabic();
      assertEquals(1, romanToArabic.calculate("I"));
  }

}
