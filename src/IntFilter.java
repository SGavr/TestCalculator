class IntFilter {

  static void numberValid(int x) {
    if ((x < 1) || (x > 10)) {
      throw new IllegalArgumentException("Некорректный аргумент");
    }
  }
}
