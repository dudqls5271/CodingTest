import java.util.ArrayList;

//https://school.programmers.co.kr/learn/courses/30/lessons/12924
// 숫자의 표현
public class Eexpression_numbers {
    public static void main(String[] args) {
        int n = 15;
        solution(n);
    }
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;

                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
