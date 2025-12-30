public class StrMultplyProblem {

    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i < k; i++)
            answer += my_string;
        String.valueOf(k);
        return answer;
    }
    public static void main(String[] args) {
        StrMultplyProblem sp = new StrMultplyProblem();
        System.out.println(sp.solution("love", 10));
    }
}
