package baeckjoon.BOJ11022;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfCase = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < numberOfCase ; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int SUM = A + B;

            bw.write("Case #" + (testCase + 1) + ": " + A + " + " + B + " = " + SUM + "\n");
        }

        bw.flush();
        bw.close();
    }
}
