package baeckjoon.BOJ10872;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 0;
        N = Integer.parseInt(br.readLine());
        long answer = 1;
        for (int i = 1; i <= N; i++) {
            answer *= i;
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
