public class Main {
  public static void main(String[] args) {
    System.out.println(nameShuffle("Mitchell Wintrow"));
  }

  public static String nameShuffle(String s) {
    String[] words = s.split(" ");
    return words[1] + " " + words[0];
  }
}
