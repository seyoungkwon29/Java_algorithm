package com.java_algorithm.recursive;

import java.util.Scanner;

public class RecursiveExample2 {
    // 2진수 출력
    public void recursive(int n) {
        if (n == 0) return;
        else {
            recursive(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        RecursiveExample2 T = new RecursiveExample2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.recursive(n);
    }
}
