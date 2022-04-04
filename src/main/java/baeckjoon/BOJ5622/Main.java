package baeckjoon.BOJ5622;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String input = br.readLine();

        int answer = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch <= 'C') {
                answer += 3;
            } else if (ch <= 'F') {
                answer += 4;
            } else if (ch <= 'I') {
                answer += 5;
            } else if (ch <= 'L') {
                answer += 6;
            } else if (ch <= 'O') {
                answer += 7;
            } else if (ch <= 'S') {
                answer += 8;
            } else if (ch <= 'V') {
                answer += 9;
            } else {
                answer += 10;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
