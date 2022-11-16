import java.util.Arrays;

public class CreateMinimum {
    public static void main(String[] args) {
        int []A = {1,4,2};
        int []B = {5,4,4};
    }
    public static int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer = answer + (A[i] *  B[B.length - i - 1]);
        }

        System.out.println(answer);
        return answer;
    }}
