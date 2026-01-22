import java.util.*;

public class NumberAndEngWordsProblem {
    public static int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String result = "";
        String temp = "";
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                result += c;
                temp = "";
                continue;
            }
            temp += c;
            for(int j = 0; j < words.length; j++){
                if(temp.equals(words[j])){
                    result += j;
                    temp ="";
                    break;
                }
            }
        }
        answer = Integer.parseInt(result);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
