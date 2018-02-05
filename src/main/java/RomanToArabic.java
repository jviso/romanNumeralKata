import java.util.HashMap;
import java.util.Map;

public class RomanToArabic {

    private Map<Character, Integer> letterValues;
    private int value;

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

        for (int i = 0; i < numeral.length(); i++) {
            if (isSubtractionNeeded(i, numeral)) {
                value -= letterValues.get(numeral.charAt(i));
            }
            else {
                addLetterValue(numeral.charAt(i));
            }
        }

        return value;
    }

    private boolean isSubtractionNeeded(int currentIndex, String numeral) {
        return (currentIndex+1 < numeral.length() &&
                letterValues.get(numeral.charAt(currentIndex)) <
                letterValues.get(numeral.charAt(currentIndex + 1)));
    }

    private void addLetterValue(char letter) {
        value += letterValues.get(letter);
    }

}
