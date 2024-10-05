package com.java_algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxScore_DFS {
    static int[] score;
    static int[] time;
    static int N;
    static int M;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        score = new int[N];
        time = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            score[i] = Integer.parseInt(st.nextToken());
            time[i] = Integer.parseInt(st.nextToken());
        }

        maxScore(0, 0, 0, score, time);
        System.out.println(max);
    }

    static void maxScore(int L, int sum, int sumTime, int[] score, int[] time) {
        if (sumTime > M) return;
        if (L == N) {
            max = Math.max(max, sum);
        }
        else {
            maxScore(L + 1, sum + score[L], sumTime + time[L], score, time);
            maxScore(L + 1, sum, sumTime, score, time);
        }
    }
}
