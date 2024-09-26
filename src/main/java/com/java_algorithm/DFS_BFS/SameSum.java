package com.java_algorithm.DFS_BFS;

import java.util.Scanner;

public class SameSum {
    static String answer = "NO";
    static int total = 0;
    static int N = 0;
    boolean flag = false;

    // 재귀함수
    public void DFS(int L, int sum, int[] arr) {
        // flag == true 면 재귀함수 돌지 않고 리턴
        if (flag) return;
        // 총합의 절반보다 부분집합의 합이 더 커지면 재귀함수 돌지 않고 리턴
        if (total / 2 < sum) return;

        if (L == N) {
            // 정수형 타입 사용했기 때문에 total/2 할 경우 소수점 인식 X -> 부정확한 조건
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
                System.out.println(sum);
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        SameSum T = new SameSum();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = new int[N];

        // 값 입력 받고 총합 구하기
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
