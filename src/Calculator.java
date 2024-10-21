import java.io.IOException;

class Calculator {

  public static String calc(int a, int b, String operation) {
    int result = switch (operation) {
      case "+" -> a + b;
      case "-" -> a - b;
      case "*" -> a * b;
      case "/" -> a / b;
      default -> throw new IllegalArgumentException("Некорректное действие: " + operation);
    };

    return String.valueOf(result);
  }
}

