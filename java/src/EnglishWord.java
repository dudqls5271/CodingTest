import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class EnglishWord {

    public static void main(String[] args) {
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        solution(n, words);
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        // 중복 제거를 위한 map.
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            // len 오버를 막음
            if(i != 0) {
                String s1 = words[i -1];
                String s2 = words[i];

                char lastStr = s1.charAt(s1.length() - 1);
                char fisrtStr = s2.charAt(0);

                // containsKey() == Map에 파라미터로 입력받은 값과 같은 값이 있으면 true를 리턴 한다.
                // len 오버를 막기 위해  2번째 값 부터 시작 했음으로 첫 번째 값이 들어 오기 전까지는 false을 반환 한다.
                // 단어와 단어의 처음 과 끝이 맞는지 확인
                if(map.containsKey(s2)  || lastStr != fisrtStr) {
                    // 위의 조건에 해당 되는 사람을 걸러줌
                    // i 번째 단어에서 아웃이 됬으면 n을 나눈 나머지에 +1을 더 하면서 사람을 구함
                    answer[0] = (i % n) + 1;
                    // i번째 단어에서 아웃이 됬으면 n을나눈 값은 순서 임으로 + 1을 해줘서 차례를 구함
                    answer[1] = (i / n) + 1;
                    System.out.println(Arrays.toString(answer));

                    return answer;
                }
            }
            System.out.println(words[i]);
            map.put(words[i], 1);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
