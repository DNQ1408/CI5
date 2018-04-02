package com.tutorialspoint;

import java.lang.*;
import java.util.Scanner;

public class QuadroExpression {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("ax2 + bx + c = 0");
        System.out.println("Please enter a");
        int a = keyboardScanner.nextInt();
        System.out.println("Please enter b");
        int b = keyboardScanner.nextInt();
        System.out.println("Please enter c");
        int c = keyboardScanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("All solutions");
                } else {
                    System.out.println("No solution");
                }
            } else {
                double x = -(double) c / b;
                System.out.println(String.format("1 solution: x = %s", x));
            }
        } else {
            int delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("No solution");
            } else if (delta == 0) {
                double x = -(double) b / (2 * a);
                System.out.println(String.format("1 solution: x = %s", x));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println(String.format("%s and %s", x1, x2));
            }
        }

    }
}
