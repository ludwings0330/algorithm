package baeckjoon.BOJ1292;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 3 7 -> 15
        // 3번째 숫자가 무엇인지, 그뒤로 무엇인지 알아야함
        // 1 <= A  <= B <= 1000

        int k = 1;
        int seq = 1;
        int answer = 0;

        for (int i = 1; i <= 1000 ; i++) {
            k --;

            if (A <= i && i <= B) {
                answer += seq;
            }

            if (k == 0) {
                seq ++;
                k = seq;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
