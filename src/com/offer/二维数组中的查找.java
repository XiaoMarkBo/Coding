package com.offer;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] a = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
        int target = 3;
        boolean find = Find(3, a);
        System.out.println(find);
    }

    public static boolean Find(int target, int[][] array) {
        int len = array.length - 1;
        int i = 0;
        while (len >= 0 && i < array[0].length) {
            if (array[len][i] < target) {
                i++;
            } else if (array[len][i] > target) {
                len--;
            } else
                return true;
        }
        return false;
    }
}
