import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class Fibonacci {

    public static void main(String[] args) {
        int n = 3;
        solution(n);
    }
    public static int solution(int n) {
        int answer[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if(i == 0) {
                answer[i] = 0;
            } else if (i == 1) {
                answer[i] = 1;
            } else {
                int sum = answer[i - 2] + answer[i - 1];
                answer[i] = sum % 1234567;
            }
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(answer[n]);
        return answer[n];
    }

}
