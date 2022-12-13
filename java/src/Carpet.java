import java.util.ArrayList;
import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Carpet {

    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        solution(brown, yellow);
    }


//        y = 1;
//        brown = 10
//        yellow = 2
//        
//        2x + 2y - 4 = brown
//        2x + 2 - 4 = 10
//        2x  = 10 + 4 - 2
//        x = 6
//        
//        (x - 2)(y - 2) = yellow
//        (6 - 2)(1 - 2) = 2
//        4 * (-1) = 2
//        -4 = 2
//        
//        x = (brown / 2) + 2 - y;
//        (brown / 2 - y)(y - 2) = yellow
//        (y - brown / 2)(y - 2) = - yellow
//        y ^2 - (2 + brown / 2)y + brown + yellow = 0



    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        // 가운데에 노란색이 낄때 최소가 3 아니깐 3부터 시작 함
        for (int i = 3; i < sum; i++) {
            int temp = sum / i;

            // 약수 를 구하는데 3 보다 커야함
            if(sum % i == 0 && temp >= 3) {
                // 가장 큰거
                int col = Math.max(i, temp);
                // 가장 작은거
                int row = Math.min(i, temp);

                // 노란색을 낄려면 가로 하고 세로에 각각 -2을 해줘야 함
                int center = (col - 2) * (row - 2);

                if(center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
