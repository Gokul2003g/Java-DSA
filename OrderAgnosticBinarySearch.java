package com.company;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;
            //the below is a better mid value finder
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
