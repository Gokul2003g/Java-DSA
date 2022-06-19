package com.company.bitwiseOperators;

class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            //reverse every row in the array
            for (int i = 0; i < (image[i].length + 1) / 2; i++) {
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image[i].length - i- 1] ^ 1;
                row[image[i].length - i- 1] = temp;
            }
        }
        return image;
    }
}