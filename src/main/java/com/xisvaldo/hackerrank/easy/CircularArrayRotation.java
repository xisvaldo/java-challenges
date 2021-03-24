package com.xisvaldo.hackerrank.easy;

/** @author leonardo.borges */
public class CircularArrayRotation {

  public static void main(String[] args) {

    int[] a = {
      10160, 27429, 61174, 92314, 90626, 66576, 13013, 3055, 28071, 13366, 48292, 83192, 376, 63276,
      35825, 39497, 39701, 46967, 95656, 92257, 31122, 91431, 72587, 78900, 77935, 27666, 52875,
      56477, 89913, 43214, 32042, 16424, 70643, 9567, 25090, 61268, 76142, 38102, 80674, 4212,
      67819, 45317, 3756, 68194, 8592, 39580, 24042, 64644, 2898, 36050, 73252, 34020, 27480, 62191,
      12919, 5415, 6208, 82146, 78243, 12472, 25359, 10284, 28896, 12353, 36202, 53985, 89973,
      12343, 8438, 86998, 32907, 76257, 32315, 36662, 60802, 57258, 92593, 84844, 38254, 95490,
      37245, 11505, 45861, 81076, 73695, 58780, 86490, 96254, 57277, 81085, 8726, 98987, 7720,
      53973, 11340, 43922, 24309, 17664, 56264, 32746, 4661, 89170, 25354, 53327, 42183, 86156,
      10585, 34775, 87351, 48838, 30265, 24595, 76694, 76125, 5670, 66741, 51256, 8512, 62994, 8532,
      5948, 88071, 23871, 13667, 42043, 51562, 73940, 66351, 69225, 46556, 15449, 73885, 35725,
      40802, 43564, 94260, 43309, 54148, 29034, 30659, 19337, 59298, 71605, 96030, 51775, 93627,
      79122, 3030, 18490, 42116, 27914, 40789, 30186, 51784, 54455, 88581, 3345, 44747, 54931,
      88921, 91302, 86731, 79157, 43378, 43885, 22720, 37637, 87193, 93219, 66671, 17852, 12555,
      42320, 5808, 24937, 94094, 15786, 4058, 13476, 34275, 62525, 57741, 75063, 9063, 9524, 45870,
      97643, 29220, 6968, 68925, 34492, 98269, 55656, 13648, 57998, 99540, 52720, 95635, 86732,
      45938, 78657, 20935, 74845, 37328, 43095, 99781, 47774, 58880, 20190, 61249, 9507, 99067,
      35341, 84569
    };
    int k = 1;
    int[] m = {
      76, 39, 57, 212, 202, 210, 14, 47, 188, 183, 178, 78, 148, 19, 118, 74, 103, 52, 72, 97, 155,
      52, 75, 48, 202, 202, 14, 112, 210, 34, 104, 4, 5, 94, 148, 207, 90, 163, 186, 211, 132, 83,
      75, 67, 102, 193, 73, 205, 177, 77, 88, 50, 62, 163, 99, 50, 84, 113, 162, 12, 148, 198, 17,
      153, 78, 165, 79, 101, 46, 197, 98, 179, 66, 105, 178, 101, 16, 183, 92, 193, 46, 113, 29,
      108, 208, 60, 158, 78, 174, 38, 23, 40, 23, 186, 125, 33, 69, 136, 66, 116, 120, 96, 81, 118,
      201, 191, 5, 3, 92, 98, 196, 138, 143, 158, 179, 137, 4, 55, 148, 110, 94, 103, 150, 49, 75,
      208, 14, 144, 130, 13, 46, 182, 109, 59, 87, 97, 182, 92, 32, 60, 122, 161, 199, 51, 105, 96,
      121, 41, 151, 201, 152, 177, 90, 20, 158, 165, 14, 173, 95, 77, 186, 74, 45, 13, 133, 64, 110,
      102, 157, 143, 162, 65, 90, 79, 49, 127, 175, 170, 168, 45, 157, 38, 154, 33, 59, 99, 130, 5,
      204, 157, 14, 108, 17, 60, 121, 83, 124, 18, 185, 213, 93, 65, 211, 183, 77, 46, 28, 184, 2,
      196, 15, 91, 21, 170, 124, 12, 201, 40, 17, 191, 197, 32, 85, 147, 24, 206, 16, 80, 156, 133,
      12, 35, 130, 9, 150, 207, 55, 178, 110, 203, 161, 125, 80, 114, 13, 204, 126, 0, 176, 75, 123,
      91, 39, 208, 170, 63, 133, 186, 76, 75, 37, 88, 111, 168, 97, 47, 161, 84, 158, 57, 73, 37,
      115, 153, 151, 60, 75, 209, 207, 183, 70, 116, 206, 42, 43, 163, 105, 176, 135, 113, 37, 173,
      201, 80, 59, 16, 60, 152, 100, 4, 142, 105, 41, 43, 44, 124, 35, 51, 119, 28, 20, 121, 77, 13,
      163, 120, 108, 201, 82, 175, 100, 51, 134, 20, 132, 193, 182, 124, 64, 1, 128, 206, 106, 101,
      181, 83, 11, 2, 134, 130, 177, 87, 37, 40, 32, 201, 92, 140, 120, 106, 101, 6, 157, 168, 172,
      7, 79, 141, 131, 143, 74, 191, 135, 180, 78, 102, 49, 89, 37, 116, 151, 0, 203, 189, 186, 167,
      108, 210, 93, 14, 102, 126, 166, 191, 80, 57, 131, 160, 130, 194, 21, 204, 172, 89, 170, 182,
      191, 152, 204, 160, 200, 141, 92, 189, 48, 64, 142, 88, 206, 167, 34, 94, 79, 201, 4, 160,
      190, 135, 38, 106, 115, 205, 96, 5, 80, 198, 120, 58, 68, 110, 150, 54, 37, 29, 175, 18, 25,
      103, 106, 18, 202, 141, 44, 68, 60, 48, 160, 36, 183, 198, 142, 17, 189, 170, 168, 202, 86,
      74, 192, 155, 184, 128, 141, 154, 157, 103, 172, 183, 206, 210, 133, 127, 137, 177, 195, 197,
      12, 141, 19, 127, 57, 93, 76, 178, 195, 31, 166, 68, 37, 144, 155, 8, 59, 82, 94, 148, 185,
      198, 49, 110
    };

    int[] result = circularArrayRotation(a, k, m);

    for (int number : result) {
      System.out.println(number);
    }
  }

  static int[] circularArrayRotation(int[] a, int k, int[] queries) {

    int[] temp = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      temp[(i + k) % a.length] = a[i];
    }

    int[] result = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      result[i] = temp[queries[i]];
    }

    return result;
  }
}
