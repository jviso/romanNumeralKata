public class RomanToArabic {

  public int calculate(String numeral) {

      int value = 0;

      for (int i = 0; i < numeral.length(); i++) {
          if (i+1 < numeral.length() && numeral.charAt(i) == 'I' && numeral.charAt(i+1) == 'V') {
              value += 4;
              i++;
          }
          else if (numeral.charAt(i) == 'I') {
              value += 1;
          }
          else if (numeral.charAt(i) == 'V') {
              value += 5;
          }
          else if (numeral.charAt(i) == 'X') {
              value += 10;
          }
      }

      return value;
  }

}
