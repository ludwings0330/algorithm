package baeckjoon.BOJ16401;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final StringTokenizer st = new StringTokenizer(br.readLine());

        // 조카수 M
        // 1 <= M <= 1,000,000
        int M = Integer.parseInt(st.nextToken());

        // 과자의 수 N
        // 1 <= N <= 1,000,000
        int N = Integer.parseInt(st.nextToken());

        // 과자의 길이 Li
        // 1 <= Li <= 1,000,000,000
        int[] L = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 모든 조카에게 같은 길이의 막대 과자를 나누어 줄 수 있는 막대 과자의 최대 길이
        // 과자를 나눌 수는 있지만 합칠 수 없다.
        int left = 1;
        int right = 1000000000;
        while (left <= right) {
            int mid = (left + right) / 2;

            int count = 0;
            for (int i = 0; i < N; i++) {
                count += L[i] / mid;
            }

            // 조카의 수와 같거나 더 많이 있다면 정답 가능성 있음
            if (count >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(right + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
