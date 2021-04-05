package com.cheekin;

public class Triangle {
    String Name;
    String InternalAngel;
    String Length;
    String LengthOfEachSide;
    String Perimeter;
    String Behavior;

    void printTriangle(String n, String I, String L,String  S, int P, String  B){
        System.out.println("Name: " + n);
        System.out.println("Internal Angel: " + I);
        System.out.println("Length: " + L);
        System.out.println("Length Of Each Side: " + S);
        System.out.println("Perimeter In CM: " + P);
        System.out.println("Behavior: " + B);

    }

}
