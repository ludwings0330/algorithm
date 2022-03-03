package codility.task1;

public class Solution {
    public static int solution(int N) {
        int prev = 0;
        int ret = 0;
        int count = 0;
        int t = 0;

        while (N >= 1) {
            if (N % 2 == 1) {
                ret = Math.max(ret, count);
                count = 0;
                t = 1;
            }

            if (N % 2 == 0) {
                count += t;
            }

            N /= 2;
        }

        return ret;
    }

    public static void main(String[] args) {
        System.out.println("Solution.solution(529) = " + Solution.solution(529));
        System.out.println("Solution.solution(1041) = " + Solution.solution(1041));
        System.out.println("Solution.solution(15) = " + Solution.solution(15));
        System.out.println("Solution.solution(32) = " + Solution.solution(32));
    }
}
