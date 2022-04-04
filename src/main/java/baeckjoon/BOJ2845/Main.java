package baeckjoon.BOJ2845;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int exactNum = L * P;

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) {
            int mediaNum = Integer.parseInt(st.nextToken());
            bw.write(mediaNum - exactNum + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
