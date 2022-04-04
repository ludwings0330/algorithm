package baeckjoon.BOJ15596;

public class Main {
    public static void main(String[] args) {

    }


    public long sum(int[] a) {
        long ret = 0;
        for (int i = 0; i < a.length; i++) {
            ret += a[i];
        }

        return ret;
    }
}
