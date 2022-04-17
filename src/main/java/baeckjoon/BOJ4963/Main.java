package baeckjoon.BOJ4963;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0},
            {1, 1}, {-1, 1}, {1, -1}, {-1, -1}};

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            final StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }

            int[][] board = new int[h][];

            for (int i = 0; i < h; i++) {
                board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
                        .toArray();
            }

            int answer = solve(board, h, w);

            bw.write(answer + "");
            bw.newLine();

            bw.flush();
        }

        bw.close();
        br.close();
    }

    static int solve(int[][] board, int h, int w) {
        boolean[][] visited = new boolean[h][w];
        int ret = 0;
        Stack<Integer[]> stack = new Stack<>();

        for (int row = 0; row < h; row++) {
            for (int col = 0; col < w; col++) {
                if (board[row][col] == 1 && !visited[row][col]) {
                    ret ++;
                    stack.add(new Integer[]{row, col});
                    visited[row][col] = true;

                    while (!stack.isEmpty()) {
                        final Integer[] poped = stack.pop();
                        int hh = poped[0];
                        int ww = poped[1];

                        for (int i = 0; i < move.length; i++) {
                            int dh = move[i][0];
                            int dw = move[i][1];

                            int nh = hh + dh;
                            int nw = ww + dw;

                            if (0 <= nh && nh < h && 0 <= nw && nw < w && board[nh][nw] == 1 && !visited[nh][nw]) {
                                stack.add(new Integer[]{nh, nw});
                                visited[nh][nw] = true;
                            }
                        }
                    }
                }
            }
        }

        return ret;
    }
}
