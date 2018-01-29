import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanToArabicTest {

    RomanToArabic romanToArabic;

    @Before
    public void setUp() {
        romanToArabic = new RomanToArabic();
    }

    @Test
    public void calculateShouldReturn1forI() {
        assertEquals(1, romanToArabic.calculate("I"));
    }

    @Test
    public void calculateShouldReturn2ForII() {
        assertEquals(2, romanToArabic.calculate("II"));
    }

    @Test
    public void calculateShouldReturn3ForIII() {
        assertEquals(3, romanToArabic.calculate("III"));
    }

    @Test
    public void calculateShouldReturn5ForV() {
        assertEquals(5, romanToArabic.calculate("V"));
    }

}
