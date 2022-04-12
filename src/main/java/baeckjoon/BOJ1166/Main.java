package baeckjoon.BOJ1166;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] input = br.readLine().split(" ");

        long N = Integer.parseInt(input[0]);
        long L = Integer.parseInt(input[1]);
        long W = Integer.parseInt(input[2]);
        long H = Integer.parseInt(input[3]);

        // N개의 작은 박스 모든 박스는 정육면체 길이는 A
        // 큰박스 L x W x H 인 직육면체 박스에 모두 넣고싶다.
        // 가능한 A의 최댓값을 찾아라
        // 1 <= N <= 1,000,000,000
        // 1 <= L, W, H <= 1,000,000,000

        // 최대값을 찾는 문제 -> 이분탐색 풀이
        // 0 <= A <= min(L,W,H)

        double left = 0;
        double right = Math.min(L, Math.min(W, H));
        double answer = 0;

        while (right/left > 1.000000000001) {
            double mid = (left + right) / 2;

            long l = (long) (L/mid);
            long w = (long) (W/mid);
            long h = (long) (H/mid);

            // N보다 같거나 많이 담을 수 있다면 정답이 될 수 있다.
            if (l * w * h >= N) {
                answer = Math.max(answer, mid);
                left = mid;
            } else {
                right = mid;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
