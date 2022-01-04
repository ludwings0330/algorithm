package baeckjoon;

import java.io.*;
/*
1
2~3
4~6
7~10
...
 */
public class BOJ1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());

        int cnt = 1;
        int i = 1;
        while ( !(cnt <= X && X < cnt + i) ) {
            cnt += i;
            i ++;
        }

        i += 1;
        int a = X-cnt+1;
        int b = i-a;
        if (i%2 == 0) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        bw.write(a+"/"+b);
        bw.flush();
        bw.close();
        br.close();
    }
}
