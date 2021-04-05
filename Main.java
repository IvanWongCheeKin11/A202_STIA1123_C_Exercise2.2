package com.cheekin;

public class Main {

    public static void main(String[] args) {

        Triangle Equilateral = new Triangle();

        Equilateral.printTriangle("Equilateral", "3 same internal angles", "3 equal length", "3, 3, 3", 9, "can be cut");
        System.out.println();


        Triangle Isosceles = new Triangle();

        Isosceles.printTriangle("Isosceles", "2 same internal angles", "2 equal length", "3, 5, 5", 13, "can be cut");
        System.out.println();


        Triangle Scalene = new Triangle();

        Scalene.printTriangle("Scalene", "3 different internal angles", "3 unequal length", "3, 4, 5", 12, "can be cut");
    }
}
