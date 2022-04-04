package baeckjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ1271 {
    public static class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            BigInteger m = new BigInteger(st.nextToken());
            BigInteger n = new BigInteger(st.nextToken());

            bw.write((m.divide(n)) + "\n");
            bw.write((m.remainder(n)) + "");

            br.close();
            bw.close();
        }
    }
}
