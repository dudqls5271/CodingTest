import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        /*Reverse_String rrs = new Reverse_String();
        char[] s = {'h','e','l','l','o'};
        System.out.println("변경 전 : " + Arrays.toString(s));
        rrs.reverseString(s);
        System.out.println("변경 후 : " + Arrays.toString(s));
        char[] s2 = {'H','a','n','n','a', 'h'};
        System.out.println("변경 전 : " + Arrays.toString(s2));
        rrs.reverseString(s2);
        System.out.println("변경 후 : " + Arrays.toString(s2));*/

        for (int i = 0; i < 2; i++) {
            System.out.println("i : " + i);
            for (int k = 0; k< 5; k++) {
                System.out.println("k : " + k);
            }
        }
    }
    public void reverseString(char[] s) {
        recursionReverse(s, s.length/2-1);
    }
    private void recursionReverse(char[] s, int cnt){
        if(cnt >= 0){
            char temp = s[cnt];
            s[cnt] = s[s.length-1-cnt];
            s[s.length-1-cnt] = temp;
            if(cnt != 0) recursionReverse(s, --cnt);
        }
    }
}