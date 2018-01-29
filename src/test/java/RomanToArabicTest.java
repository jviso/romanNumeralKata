import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanToArabicTest {

    @Test
    public void calculateShouldReturn1forI() {
        RomanToArabic romanToArabic = new RomanToArabic();
        assertEquals(1, romanToArabic.calculate("I"));
    }

    @Test
    public void calculateShouldReturn2ForII() {
        RomanToArabic romanToArabic = new RomanToArabic();
        assertEquals(2, romanToArabic.calculate("II"));
    }

}
