package baeckjoon.BOJ11039;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = Integer.parseInt(br.readLine());
            answer += (tmp > 40) ? tmp : 40;
        }

        bw.write(answer/5 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
