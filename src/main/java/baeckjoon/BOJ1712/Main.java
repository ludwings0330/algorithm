package baeckjoon.BOJ1712;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        /*
        1대 -> A+B 원
        n대 -> C*n - (A + B * n) > 0
         */
        int breakEvenPoint = -1;
        if (C > B) {
            breakEvenPoint = A / (C - B) + 1;
        }
        bw.write(breakEvenPoint + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
