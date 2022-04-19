package com.company;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 5, 1, 3};
        System.out.println(sort(arr));
    }
    /* there will be two cases
    second when the N number is missing
     */
    static int sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && i != nums[i]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }


        //search
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
                }
            }
        return nums.length;
        }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
