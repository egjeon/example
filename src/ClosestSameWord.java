import java.util.*;

public class ClosestSameWord {
    public static int[] solution(String s) {

        int[] answer = new int[s.length()];
        String[] word = s.split("");
        StringBuilder emptyStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (emptyStr.toString().contains(word[i])) {
                answer[i] = i - emptyStr.lastIndexOf(word[i]);
            } else {
                answer[i] = -1;
            }
            emptyStr.append(word[i]);
        }
        return answer;

        /*int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                answer[i] = i-map.get(c);
            }else{
                answer[i] = -1;
            }
            map.put(c, i);
        }
        return answer;*/
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
    }

}
