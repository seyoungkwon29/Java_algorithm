package com.java_algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Badooki_DFS {
    static int N;
    static int C;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        badooki(0, 0, arr);
        System.out.println(answer);
    }

    static void badooki(int L, int sum, int[] arr) {
        if (sum > C) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            badooki(L + 1, sum + arr[L], arr);
            badooki(L + 1, sum, arr);
        }
    }
}
