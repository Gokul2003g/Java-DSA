package com.company.recursion.Level1;

public class ReverseANumber {
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
    }

    static int sum=0;
    static void rev1(int n) {
        if(n==0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    static void rev2(int n) {
        /*
        sometimes I might need some additional variables in the argument
        in that case, make another helper function
         */
    }
}
