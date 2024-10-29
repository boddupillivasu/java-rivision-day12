package com.javarevision.arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {


        int[][] num = {{1, 2, 3},{123, 3, 3},{2, 4, 6}};
        int element =num [0][1];
        for (int i =0; i<num.length;i++){
            for (int j =0;j<num.length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}