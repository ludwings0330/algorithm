package programmers;

import java.util.Arrays;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 45;

        final int sum = Arrays.stream(numbers).sum();
        answer -= sum;

        return answer;
    }
}
