package com.xisvaldo.hackerrank.easy;

/**
 * @author leonardo.borges
 */
public class SaveThePrisoner {

  public static void main(String[] args) {

    int n = 3; //Prisoners
    int m = 7; //Candies
    int s = 3; //Hat position

    //5 2 1 = 2
    //5 2 2 = 3
    //7 19 2 = 6
    //3 7 3 = 3
    System.out.println(saveThePrisoner(n, m, s));
  }

  static int saveThePrisoner(int n, int m, int s) {
    int result = ((m + s - 1) % n);
    return result == 0 ? n : result;
  }
}
