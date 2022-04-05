package baeckjoon.BOJ1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int N = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            if (groupChecker(word)) {
                answer ++;
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean groupChecker(String word) {
        boolean ret = true;
        boolean[] isUsed = new boolean['z' + 1];

        for (int i = 0; i < word.length(); i++) {
            int w = word.charAt(i);

            if (i != 0 && (isUsed[w] && word.charAt(i - 1) != w)) {
                ret = false;
                break;
            }

            isUsed[w] = true;
        }

        return ret;
    }
}
