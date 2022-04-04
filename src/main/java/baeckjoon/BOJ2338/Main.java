package baeckjoon.BOJ2338;

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        bw.write(A.add(B) + "\n");
        bw.write(A.subtract(B) + "\n");
        bw.write(A.multiply(B).toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
