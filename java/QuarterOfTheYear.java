// return which quarter of the year a month is

public class QuarterOfTheYear {

  public static int quarterOf(int month) {
    return (int) Math.ceil((double) month / 3);
  }

  public static void main(String[] args) {
    System.out.println(quarterOf(3)); // 1
    System.out.println(quarterOf(8)); // 3
  }
}

/*
 * Given a month as an integer from 1 to 12, return to which quarter of the year
 * it belongs as an integer number.
 * 
 * For example: month 2 (February), is part of the first quarter; month 6
 * (June), is part of the second quarter; and month 11 (November), is part of
 * the fourth quarter.
 */
