package baeckjoon.BOJ1026;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] A = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] B = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(A);
        Arrays.sort(B);

        int count = 0;
        for (int i = 0; i < N; i++) {
            count += A[i] * B[N - i - 1];
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
