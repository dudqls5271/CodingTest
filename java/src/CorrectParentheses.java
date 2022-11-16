
public class CorrectParentheses {
    public static void main(String[] args) {
        String s = "()()";
        solution(s);
    }
    static boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        String start = "(";
        String end = ")";

        int open = 0;
        int close = 0;

        if(!s.startsWith(start)){
            return false;
        }
        if(!s.endsWith(end)){
            return false;
        }

        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
        }

        if((open + close) % 2 != 0) {
            answer = false;
        }
        if(open != close) {
            answer = false;
        }

        int st = 0;
        int ed = 0 ;
        for (int i = 0 ; i < len; i++) {
            if (ed > st) {
                answer =  false;
            }
            if (s.charAt(i) == '(') {
                st++;
            }else{
                ed++;
            }
        }
        return answer;
    }
}
