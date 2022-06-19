package com.company.bitwiseOperators;

public class CountOfSetBits {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n - (n & (-n));
        }
        // we can also and n and n-1
        //n = n & (n-1);

        return count;
    }
}
