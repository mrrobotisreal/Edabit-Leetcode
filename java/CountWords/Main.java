public class Main {
  public static int countWords(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    String[] words = s.split("\\s+");
    return words.length;
  }

  public static void main(String[] args) {
    int wordCount = countWords("This is a test to count words");
    System.out.println(wordCount);
  }
}
