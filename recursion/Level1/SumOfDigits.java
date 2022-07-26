package com.company.recursion.Level1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(111));

    }

    static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sum(n / 10);
    }
}
