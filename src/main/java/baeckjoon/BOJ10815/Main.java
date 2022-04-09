package baeckjoon.BOJ10815;

import com.sun.source.tree.InstanceOfTree;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1 <= N <= 500,000
        // 1 <= M <= 500,000

        // 가지고 있는 숫자인지 아닌지 판별하기
        // -> 정렬

        int N = Integer.parseInt(br.readLine());
        int[] cards = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.sort(cards);

        int M = Integer.parseInt(br.readLine());
        int[] checkNumber = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < M; i++) {
            if (isInCardList(checkNumber[i], cards)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isInCardList(int target, int[] cards) {
        boolean ret = false;
        int left = 0;
        int right = cards.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (cards[middle] == target) {
                ret = true;
                break;
            }

            if (cards[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return ret;
    }
}
