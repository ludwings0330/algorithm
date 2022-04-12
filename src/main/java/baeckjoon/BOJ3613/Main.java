package baeckjoon.BOJ3613;

import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int gap = 0;

        if (input.contains("_")) {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch == '_' ||  ('a' <= ch && ch <= 'z')) {

                    if (ch == '_') {
                        gap = 'A' - 'a';
                    } else {
                        bw.write(ch + gap);
                        gap = 0;
                    }
                } else {
                    bw = new BufferedWriter(new OutputStreamWriter(System.out));
                    bw.write("Error!");
                    break;
                }
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                if (ch == '_' || ('A' <= ch && ch <= 'Z')) {
                    if ('A' <= ch && ch <= 'Z') {
                        bw.write('_');
                        bw.write(ch - ('A' - 'a'));
                    } else {
                        bw.write(ch);
                    }
                } else {
                    bw = new BufferedWriter(new OutputStreamWriter(System.out));
                    bw.write("Error!");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();

        br.close();
    }
}
