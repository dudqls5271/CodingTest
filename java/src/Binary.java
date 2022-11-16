public class Binary {

    public static void main(String[] args) {
        String s = "110010101001";
        solution(s);
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")) {
            answer[0]++;

            String temp = s.replaceAll("0", "");
            answer[1] += s.length() - temp.length();
            s = String.valueOf(Integer.toBinaryString(temp.length()));
        }

        System.out.println();
        return answer;
    }
}
