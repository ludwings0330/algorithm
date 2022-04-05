package baeckjoon.BOJ2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        String[] patterns = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String pattern : patterns) {
            word = word.replaceAll(pattern, "1");
        }

        bw.write(word.length() + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
