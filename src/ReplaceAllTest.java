public class ReplaceAllTest {
    public static int solution (String s){
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < words.length; i++){
            s = s.replaceAll(words[i], String.valueOf(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
    public static void main(String[] args) {
        String a = "2three45sixseven";
        System.out.println(solution(a));
    }
}
