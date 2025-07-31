package com.rustam.leetcode;
import com.rustam.leetcode.arrays.P1_two_sum;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double x = 7.5;
        double y = 4.5;
        y = y - 2;
        x = y;
        double result = (y - 0.5) * 2 + 3.5 + x * 2;
        System.out.print(result);
    }
}