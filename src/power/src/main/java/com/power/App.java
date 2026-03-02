package com.power;

public class App {
    public static void main(String[] args) {
        double twoSq = power(2, 2);
        double twoPointThree = power(2.3, 4);

        System.out.printf("2^2 = %f\n", twoSq); // Expect 4
        System.out.printf("2.3^4 = %f\n", twoPointThree); // Expect 27.9841
    }

    public static double power(double base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent - 1);
    }
}
