package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class RepeatedStrings {

  public static void main(String[] args) {
    /*String s = "abcac";
    long n = 10;*/
    String s = "a";
    long n = 1000000000000l;
    /*String s = "aba";
    long n = 10;*/

    System.out.println(repeatedString(s, n));
  }

  static long repeatedString(String s, long n) {

    long count = s.chars().filter(ch -> ch == 'a').count();
    long factor = n / s.length();
    long remain = n % s.length();

    count *= factor;

    for (int i = 0; i < remain; i++)  {
      if (s.charAt(i) == 'a') count++;
    }

    return count;
  }
}
