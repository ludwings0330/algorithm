package baeckjoon.BOJ2512;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 3 <= N <= 10_000
        int N = Integer.parseInt(br.readLine());

        int[] budgets = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // N <= M <= 1_000_000_000
        int M = Integer.parseInt(br.readLine());

        int left = 0;
        int right = M;

        int answer = 1;
        // 조건 만족 ->
        while (left <= right) {
            int middle = (left + right) / 2;
            int useBudget = 0;

            for (int i = 0; i < N; i++) {
                if (budgets[i] <= middle) {
                    useBudget += budgets[i];
                } else {
                    useBudget += middle;
                }
            }

            // 만족하면 예산을 더 많이 할당해도된다.
            if (useBudget <= M) {
                left = middle+1;
                answer = middle;
            } else {
                right = middle-1;
            }

        }
        int SUM = Arrays.stream(budgets)
                .sum();
        if (SUM <= M) {
            answer = Arrays.stream(budgets)
                    .max().orElse(answer);
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
