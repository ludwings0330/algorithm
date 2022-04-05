package baeckjoon.BOJ2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int[] isPrime = new int[10001];
        isPrime[1] = 1;

        for (int i = 2; i < 10001; i++) {
            int k = 2;
            if (isPrime[i] == 0) {
                while (i * k < 10001) {
                    isPrime[i*k] = 1;
                    k ++;
                }
            }
        }

        int answer = 0;
        int min = 987654321;

        for (int i = M; i <= N; i++) {
            if (isPrime[i] == 0) {
                min = Math.min(min, i);
                answer += i;
            }
        }

        if (answer == 0) {
            bw.write(-1 + "");
        } else {
            bw.write(answer + "");
            bw.newLine();
            bw.write(min + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
