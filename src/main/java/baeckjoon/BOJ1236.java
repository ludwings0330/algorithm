package baeckjoon;

import java.io.*;
import java.util.StringTokenizer;

/*
BOJ1236 성 지키기


 */
public class BOJ1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 세로 N, 가로 M
        String board[][] = new String[N][M];
        for (int r = 0; r < N; r++) {
            board[r] = br.readLine().split("");

        }

        int ans = 0;

        for (int r = 0; r < N; r++) {
            boolean flag = true;
            // 경비원이 없으면 true

            for (int c = 0; c < M; c++) {
                if (!board[r][c].equals(".")) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans += 1;
            }
        }

        int ans2 = 0;
        for (int c = 0; c < M; c++) {
            boolean flag = true;
            // 경비원이 없으면 true

            for (int r = 0; r < N; r++) {
                if (!board[r][c].equals(".")) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans2 += 1;
            }
        }
        int ret = (ans > ans2)?ans:ans2;

        bw.write(ret+"");
        bw.flush();

        br.close();
        bw.close();
    }
}
