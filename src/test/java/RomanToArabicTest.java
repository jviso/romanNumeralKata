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

    @Test
    public void calculateShouldReturn4ForIV() {
        assertEquals(4, romanToArabic.calculate("IV"));
    }

    @Test
    public void calculateShouldReturn10ForX() {
        assertEquals(10, romanToArabic.calculate("X"));
    }

    @Test
    public void calculateShouldReturn9ForIX() {
        assertEquals(9, romanToArabic.calculate("IX"));
    }

    @Test
    public void calculateShouldReturn50ForL() {
        assertEquals(50, romanToArabic.calculate("L"));
    }

}
