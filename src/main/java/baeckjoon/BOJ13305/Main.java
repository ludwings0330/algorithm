package baeckjoon.BOJ13305;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<BigInteger> distances = Arrays.stream(br.readLine().split(" "))
                .map(BigInteger::new)
                .collect(Collectors.toList());

        List<BigInteger> prices = Arrays.stream(br.readLine().split(" "))
                .map(BigInteger::new)
                .collect(Collectors.toList());

        /**
         * 그리디 알고리즘
         * 1. 기름값이 최소인 곳에서 남은 기름을 모두 충전
         * 2. O(N) 으로 처리 가능
         */

        int current = 0;
        BigInteger answer = new BigInteger("0");
        BigInteger currentPrice = prices.get(current);
        for (int i = 0; i < N - 1; i++) {
            BigInteger nextPrice = prices.get(i);
            BigInteger distance = distances.get(i);

            if (currentPrice.compareTo(nextPrice) != -1) {
                currentPrice = nextPrice;
            }

            answer = answer.add(distance.multiply(currentPrice));
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
