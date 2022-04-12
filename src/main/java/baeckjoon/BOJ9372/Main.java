package baeckjoon.BOJ9372;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // N개국
        // 최대한 적은 종류의 비행기를 타고 국가를 이동
        // 이미 방문한 국가를 거쳐갈 수 있다.

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        for (int testCase = 0 ; testCase < T ; testCase++) {
            final StringTokenizer st = new StringTokenizer(br.readLine());
            // 국가의 수
            int N = Integer.parseInt(st.nextToken());
            // 비행기의 종류
            int M = Integer.parseInt(st.nextToken());

            boolean[][] isConnect = new boolean[N+1][N+1];

            for (int i = 0; i < M; i++) {
                int[] input = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                int a = input[0];
                int b = input[1];

                // a -> b 와 b -> a 는 연결되어 있다.
                isConnect[a][b] = true;
                isConnect[b][a] = true;
            }

            // 최소갯수의 경로만 사용해서 풀이
            Deque<Integer> deque = new ArrayDeque<>();
            boolean[] isVisit = new boolean[N + 1];
            int answer = 0;

            deque.addLast(1);
            isVisit[1] = true;

            while (!deque.isEmpty()) {
                int current = deque.pollFirst();
                for (int next = 0; next < N + 1; next++) {
                    // 다음 노드를 방문하지 않았고 길이 연결되어 있을 때.
                    if (!isVisit[next] && isConnect[current][next]) {
                        isVisit[next] = true;
                        deque.addLast(next);
                        answer++;
                    }
                }
            }
            bw.write(answer + "");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }

}
