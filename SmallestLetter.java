package com.company;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] letter = {'c','f','j'};
        char target = 'c';
        char out = nextGreatestLetter(letter,target);
        System.out.println(out);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        //find the middle element
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
