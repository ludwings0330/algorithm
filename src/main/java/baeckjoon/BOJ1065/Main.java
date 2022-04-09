package baeckjoon.BOJ1065;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // N <= 1000
        // 1~N 까지 한수의 개수 출력
        // 한수 : 각자리가 등차수열을 이루는 수

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (check(i)) {
                count ++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean check(int N) {
        boolean result = true;

        if (N <= 10) {
            return result;
        }

        final int gap = N % 10 - N / 10 % 10;

        while (N/10 > 0) {
            int current = N % 10;
            int next = N / 10 % 10;

            int subGap = current - next;

            if (subGap != gap) {
                result = false;
                break;
            }

            N /= 10;
        }

        return result;
    }
}
