public class RomanToArabic {

  public int calculate(String numeral) {

      int value = 0;

      for (int i = 0; i < numeral.length(); i++) {
          if (numeral.charAt(i) == 'I') {
              value += 1;
          }
      }

      return value;
  }

}
