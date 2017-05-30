package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 68;
        if ((3 <= a) && (a <= 6)) {
            System.out.println("Kindergarden");
        } else if ((7 <= a) && (a <= 17)) {
            System.out.println("School");
        } else if ((18 <= a) && (a <= 22)) {
            System.out.println("University");
        } else if ((23 <= a) && (a <= 60)) {
            System.out.println("Work");
        } else if ((60 < a) && (a <= 90)) {
            System.out.println("Retiremnet");
        }
    }
}
