package com.xisvaldo.hackerrank.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author leonardo.borges
 */
public class BonAppetit {

  public static void main(String[] args) {

    List<Integer> bill = Arrays.asList(3, 10, 2, 9);
    int k = 1;
    int b = 12;

    bonAppetit(bill, k, b);

    b = 7;

    bonAppetit(bill, k, b);
  }

  static void bonAppetit(List<Integer> bill, int k, int b) {

    int commonTotal = bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k);

    if (commonTotal/2 == b)
      System.out.println("Bon Appetit");
    else
      System.out.println(b - (commonTotal/2));
  }

}
