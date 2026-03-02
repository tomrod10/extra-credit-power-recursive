package com.power;

public class App {
    public static void main(String[] args) {
        System.out.println("Power recursive functions");
    }

    public static double power(double base, int exponent) {
        if (exponent == 1) {
            return base;
        }

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }
}
