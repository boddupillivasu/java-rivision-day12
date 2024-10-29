package com.javarevision.arrays;

public class Arrays {
    public static void main(String[] args) {
        /* arrays  are collection of elements which is used to store the same datatype
        * the arrays are index based and they always starts with 0 and ends with (num of elements -1)
        *
        * the array is created by create,initialize,declaring
        *
        * the array is created by datatype with is declare [];
        * the array is initialize   with elements with{};

        * */

        int [] num = {1,2,3,4,5};
        System.out.println("the array 0 position is:"+num[0]);
        System.out.println("the array 4 position is:"+num[4]);
        num[4] =7;
        System.out.println(" after changing the  value of array 4 position is:"+num[4]);

        System.out.println("---by using for loop ---");

        String [] names = {"vasu","siva","suresh","raju","java"};
        for (int  i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

        /* initilize  the array by using loop*/
        System.out.println("--- initializing the values by using for loop ");
        int [] array = new int[9];
        for (int i=0;i< array.length;i++){
            array[i]=i+1;
        }
        for (int j:array){
            System.out.println(j);
        }
        System.out.println("the 7 position of the array:"+array[7]);
    }
}
