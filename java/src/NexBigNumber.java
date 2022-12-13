// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class NexBigNumber {
    public static void main(String[] args) {
        int n = 15;
        solution(n);
    }

    public static int solution(int n) {
        String temp =Integer.toBinaryString(n);

        int aCount = temp.length() - temp.replace("1", "").length();

        int n_temp = n+1;

        while (true){
            if(Integer.toBinaryString(n_temp).length() - Integer.toBinaryString(n_temp).replace("1", "").length() == aCount) {
                return n_temp;
            }
            n_temp ++;
        }
    }
}
