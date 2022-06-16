
package com.company;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {
    public List<Integer> findMissingNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }

        // find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
