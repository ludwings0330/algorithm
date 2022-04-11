package baeckjoon.BOJ2003;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int i = 0;
        int j = 0;

        int answer = 0;
        int sum = A[0];

        while (j < N) {
            if (sum == M) {
                answer ++;
                sum -= A[i];
                i ++;
            }

            if (sum > M) {
                sum -= A[i];
                i ++;
            }

            if (sum < M) {
                j++;
                if (j == N) {
                    break;
                }
                sum += A[j];
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
