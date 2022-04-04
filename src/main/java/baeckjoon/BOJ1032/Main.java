package baeckjoon.BOJ1032;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            if (answer.length() == 0) {
                answer.append(br.readLine());
                continue;
            }
            String next = br.readLine();
            for (int j = 0; j < next.length(); j++) {
                if (answer.charAt(j) != next.charAt(j)) {
                    answer.replace(j, j+1, "?");
                }
            }
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
