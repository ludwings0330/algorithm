package baeckjoon.BOJ1427;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String number = br.readLine();
        String[] numbers = number.split("");

        Arrays.sort(numbers, Collections.reverseOrder());
        for (String s : numbers) {
            bw.write(s);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
