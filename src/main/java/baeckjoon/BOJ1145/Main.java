package baeckjoon.BOJ1145;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[5];

        for (int i = 0; i < 5 ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = 0;
        while (true) {
            n += 1;
            int c = 0;
            for (int i = 0; i < 5; i++) {
                if (n % arr[i] == 0) {
                    c++;
                }
            }
            if (c >= 3) {
                bw.write(n);
                break;
            }
        }

        br.close();
        bw.close();
    }
}
