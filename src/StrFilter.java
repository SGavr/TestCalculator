import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StrFilter {

  static String[] patternValid(String input) {

    Pattern pattern = Pattern.compile("^\\d+\\s{1}[\\+\\-\\*\\/]\\s{1}\\d+$");
    Matcher matcher = pattern.matcher(input);

    if (!matcher.matches()) {
      throw new IllegalArgumentException("Некорректный формат ввода");
    }

    String[] strArray = input.split(" ");
    return strArray;
  }
}