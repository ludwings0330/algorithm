package baeckjoon.BOJ2217;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        // 1 <= N <= 100_000

        List<Integer> ropes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ropes.add(Integer.parseInt(br.readLine()));
        }

        // k 개 로프 사용하여 w 중량의 물체를 들어올린다.
        // 각 로프에 걸리는 무게는 w/k 이며
        // 모든 i에 대하여 w / k <= ropes[i]
        // 최대무게 w를 구하라.

        ropes.sort(Comparator.reverseOrder());

        int index = 0;
        int max = 0;
        for (Integer rope : ropes) {
            max = Math.max(max, rope * (index + 1));
            index ++;
        }

        bw.write(max + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
