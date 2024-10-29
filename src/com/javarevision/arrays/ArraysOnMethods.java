package com.javarevision.arrays;

import static java.lang.Long.sum;

public class ArraysOnMethods {

    public static void main(String[] args) {


        int[] num = {1, 3, 4, 5, 2};
        sum(num);
    }

        public static  void sum(int[] num){
            int add =0;

            for (int i =0; i<num.length;i++){
                add +=num[i];

        }
            System.out.println(add);
    }
}
