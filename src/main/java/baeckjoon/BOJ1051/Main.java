package baeckjoon.BOJ1051;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int board[][] = new int[N][];

        for (int i = 0; i < N; i++) {
            int line[] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            board[i] = line;
        }

        int answer = 0;
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < M; col++) {
                int d = 0;
                while (row + d < N && col + d < M) {
                    if (isSquare(board, row, col, d)) {
                        answer = Math.max(answer, (d+1)*(d+1));
                    }
                    d ++;
                }
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isSquare(int[][] board, int row, int col, int d) {
        return (board[row][col] == board[row][col + d])
                && (board[row][col + d] == board[row + d][col])
                && (board[row + d][col] == board[row + d][col + d]);
    }
}
