package programmers;

import java.util.HashMap;

public class 위장 {
    public int solution(String[][] clothes) {
        int answer = 1;
        int CLOTH_NAME = 0;
        int CLOTH_TYPE = 1;

        HashMap<String, Integer> clothesGroup = new HashMap<>();

        for (String[] cloth :
                clothes) {
            clothesGroup.put(cloth[CLOTH_TYPE], clothesGroup.getOrDefault(cloth[CLOTH_TYPE], 0) + 1);
        }


        for (int value:
             clothesGroup.values()) {
            answer *= (value + 1);
        }

        return answer - 1;
    }
}
