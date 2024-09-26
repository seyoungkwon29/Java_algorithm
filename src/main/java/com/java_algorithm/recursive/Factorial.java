package com.java_algorithm.recursive;

import java.util.Scanner;

public class Factorial {

    public int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial T = new Factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.factorial(n));
    }
}
