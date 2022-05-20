public class CountTrue {
  public static int countTrue(boolean[] arr) {
    int count = 0, i;
    for (i = 0; i < arr.length; i++) {
      if (arr[i]) {
        count += 1;
      }
    }
    return count;
  }
}
