// return an array that counts by the inputed number

import java.util.Arrays;

public class CountByX {

  public static int[] countBy(int x, int n) {
    int[] intArr = new int[n];
    for (int i = 0; i < n; i++) {
      intArr[i] = x * (i + 1);
    }
    return intArr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(countBy(1, 10))); //
    System.out.println(Arrays.toString(countBy(2, 5))); //
  }
}

/*
 * Create a function with two arguments that will return an array of the first n
 * multiples of x.
 * 
 * Assume both the given number and the number of times to count will be
 * positive numbers greater than 0.
 * 
 * Return the results as an array or list ( depending on language ).
 */
