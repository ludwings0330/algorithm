package baeckjoon.BOJ1940;

import java.awt.event.ContainerListener;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] materials = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(materials);

        int head = 0;
        int tail = N - 1;
        int answer = 0;

        while (head < tail) {
            int sum = materials[head] + materials[tail];

            if (sum < M) {
                head ++;
            } else if (sum > M) {
                tail--;
            } else {
                answer ++;
                head ++;
                tail --;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
