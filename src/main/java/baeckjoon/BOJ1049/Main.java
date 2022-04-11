package baeckjoon.BOJ1049;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> packagePrices = new ArrayList<>();
        List<Integer> singlePrices = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int packagePrice = Integer.parseInt(st.nextToken());
            int singlePrice = Integer.parseInt(st.nextToken());

            packagePrices.add(packagePrice);
            singlePrices.add(singlePrice);
        }

        packagePrices.sort(Comparator.naturalOrder());
        singlePrices.sort(Comparator.naturalOrder());

        int minPackagePrice = packagePrices.get(0);
        int minSinglePrice = singlePrices.get(0);

        int quotient = N / 6;
        int remainder = N % 6;

        int MIN = Math.min(quotient * minPackagePrice + remainder * minSinglePrice, N * minSinglePrice);
        MIN = Math.min(MIN, (quotient + 1) * minPackagePrice);

        bw.write(MIN + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
