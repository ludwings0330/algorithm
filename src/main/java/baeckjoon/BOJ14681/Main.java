package baeckjoon.BOJ14681;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int answer = 0;
        if (x > 0 && y > 0) {
            answer = 1;
        } else if (x > 0 && y < 0) {
            answer = 4;
        } else if (x < 0 && y < 0) {
            answer = 3;
        } else {
            answer = 2;
        }

        System.out.println(answer);
    }
}
