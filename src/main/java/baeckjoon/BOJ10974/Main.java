package baeckjoon.BOJ10974;

import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringBuilder sb = new StringBuilder();

    static int N;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        boolean[] isVisit = new boolean[N];

        recursiveSolve(0, isVisit, new int[N]);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void recursiveSolve(int n, boolean[] isVisit, int[] arr) throws IOException {
        if (n == N) {
            for (int a :
                    arr) {
                sb.append(a + 1).append(" ");
            }
            sb.append("\n");

            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisit[i]) {
                arr[n] = i;
                isVisit[i] = true;
                recursiveSolve(n + 1, isVisit, arr);
                isVisit[i] = false;
            }
        }
    }
}
