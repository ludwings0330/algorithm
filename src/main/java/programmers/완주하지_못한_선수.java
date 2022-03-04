package programmers;

import java.util.HashMap;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participants = new HashMap<>();

        for (var name:
             participant) {
            if (participants.containsKey(name)) {
                participants.put(name, participants.get(name) + 1);
                continue;
            }

            participants.put(name, 1);
        }

        for (var name :
                completion) {
            int numberOfPeople = participants.get(name);
            if (numberOfPeople == 1) {
                participants.remove(name);
                continue;
            }

            participants.put(name, numberOfPeople - 1);
        }

        return participants.keySet().stream().findFirst().get();
    }
}
