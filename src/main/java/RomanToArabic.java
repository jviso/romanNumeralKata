import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

    private Map<Character, Integer> letterValues;

    public RomanToArabic() {
        letterValues = new HashMap<>();
        letterValues.put('I', 1);
        letterValues.put('V', 5);
        letterValues.put('X', 10);
        letterValues.put('L', 50);
        letterValues.put('C', 100);
        letterValues.put('D', 500);
        letterValues.put('M', 1000);
    }


    public int calculate(String numeral) {

        int value = 0;

        for (int i = 0; i < numeral.length(); i++) {
            if (i+1 < numeral.length() && numeral.charAt(i) == 'I' && numeral.charAt(i+1) != 'I') {
                value -= 1;
            }
            else {
                value += letterValues.get((numeral.charAt(i)));
            }
        }

        return value;
    }

}
