package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class AppendDelete {

  public static void main(String[] args) {

    String s = "hackerhappy";
    String t = "hackerrank";
    int k = 9;

    /*String s = "ashley";
    String t = "ash";
    int k = 2;*/

    /*String s = "aba";
    String t = "aba";
    int k = 7;*/

    System.out.println(appendAndDelete(s, t, k));
  }

  static String appendAndDelete(String s, String t, int k) {

    int commonLength = 0;

    for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
      if (s.charAt(i) == t.charAt(i)) {
        commonLength++;
      }
      else {
        break;
      }
    }

    if (s.length() + t.length() - (2 * commonLength) > k) {
      return "No";
    }
    else if ((s.length() + t.length() - (2 * commonLength)) % 2 == k % 2) {
      return "Yes";
    }
    else if (s.length() + t.length() - k < 0) {
      return "Yes";
    }

    return "No";
  }
}
