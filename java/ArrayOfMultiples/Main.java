import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(java.util.Arrays.toString(arrayOfMultiples(7, 5)));
  }

	public static int[] arrayOfMultiples(int num, int length) {
		int[] multiples = new int[length];
		for (int i = 0; i < length; i++) {
			multiples[i] = (i + 1) * num;
		}
		return multiples;
	}
}