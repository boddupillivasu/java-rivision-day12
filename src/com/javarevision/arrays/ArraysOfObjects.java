package com.javarevision.arrays;

public class ArraysOfObjects {

    String name;
    int id;
    String email;

    public ArraysOfObjects(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public static void main(String[] args) {

        ArraysOfObjects[] arraysOfObjects = new ArraysOfObjects[3];
        arraysOfObjects[0] = new ArraysOfObjects("vasu", 13, "vasu13@gmail.com");
        arraysOfObjects[1] = new ArraysOfObjects("bharath", 22, "bharthchandu22@gmail.com");
        arraysOfObjects[2] = new ArraysOfObjects("challa venkatakalyan", 20, "challavenkatakalyan@gmail.com");

        System.out.println(arraysOfObjects[0].name);
        System.out.println(arraysOfObjects[0].id);
        System.out.println(arraysOfObjects[0].email);

        System.out.println(arraysOfObjects[1].name);
        System.out.println(arraysOfObjects[1].id);
        System.out.println(arraysOfObjects[1].email);

        System.out.println(arraysOfObjects[2].name);
        System.out.println(arraysOfObjects[2].id);
        System.out.println(arraysOfObjects[2].email);
    }
}
