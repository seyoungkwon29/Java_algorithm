package com.java_algorithm.recursive;

import java.util.Scanner;

public class RecursiveExample1 {

    public void recursive(int n) {
        if (n == 0) return;
        else {
            // 재귀함수는 스택프레임을 사용한다.
            // System.out.print(n + " ");
            // recursive(n - 1);
            // 위 순서로 실행하면 내림차순으로 표현된다.

            recursive(n - 1);
            System.out.print(n + " ");

        }
    }

    public static void main(String[] args) {
        RecursiveExample1 T = new RecursiveExample1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.recursive(n);
    }
}
