package programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 전화번호_목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        List<String> sorted = Arrays.stream(phone_book).sorted().collect(Collectors.toList());

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (sorted.get(i + 1).startsWith(sorted.get(i))) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
