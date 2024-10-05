package com.java_algorithm.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Change {
    // 동전
    static int[] coins;
    // 총 거스름돈
    static int total;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        // 동전 갯수
        int n = Integer.parseInt(st.nextToken());
        coins = new int[n];

        // 동전 배열
        st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        total = Integer.parseInt(st.nextToken());

        change(0, 0);

        System.out.println(min);
    }
    static void change(int count, int sum) {

        // 거슬러준 돈의 총액이 거스름돈을 넘거나
        // 거슬러준 동전의 갯수가 최소값보다 작으면 return
        if (sum > total || count >= min) return;

        // 위 조건에서 거슬러준 동전의 갯수가 최소값보다 작으면 return 하기 때문에
        // min = Math.min(min, count) -> min 이 count 값이 됨
        if (sum == total) {
            min = count;
        } else {
            // 큰 거스름돈부터 계산해서 불필요한 계산하지 않게
            for (int i = coins.length - 1; i >= 0; i--) {
                change(count + 1, sum + coins[i]);
            }
        }
    }
}
