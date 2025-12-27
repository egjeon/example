public class StrShuffleProblem {
    public static String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++)
            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));

        return answer;
    }
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(solution(str1,str2));

    }
}
