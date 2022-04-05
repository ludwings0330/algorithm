package baeckjoon.BOJ1475;

import java.io.*;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) throws IOException {
        // 0 ~ 9
        // 다솜이의 방번호가 주어졌을 때 필요한 세트의 개수의 최소값

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nums = br.readLine();
        int[] count = new int['9' + 1];

        for (int i = 0; i < nums.length(); i++) {
            final char c = nums.charAt(i);
            count[c] ++;
        }

        int rotatable = (count['6'] + count['9'] + 1) / 2;
        count['6'] = count['9'] = rotatable;

        final OptionalInt max = Arrays.stream(count)
                .max();
        int answer = max.orElse(0);

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
