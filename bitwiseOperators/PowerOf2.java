package com.company.bitwiseOperators;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(isPowerOf2(n));
    }

    static boolean isPowerOf2(int a) {
        if ((a & (a-1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
