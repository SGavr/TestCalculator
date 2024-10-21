import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите выражение:");
    String input = scanner.nextLine();
    scanner.close();
    System.out.println(calc(input));

  }

  public static String calc(String input) {
    int a = 0;
    int b = 0;
    String[] arrStr = StrFilter.patternValid(input);
    try {
      a = Integer.parseInt(arrStr[0]);
      b = Integer.parseInt(arrStr[2]);
    } catch (NumberFormatException e) {
      System.out.println("Некорректный аргумент");
      e.printStackTrace();
      System.exit(1);
    }

    IntFilter.numberValid(a);
    IntFilter.numberValid(b);
    String operation = arrStr[1];
    return Calculator.calc(a, b, operation);
  }
}
