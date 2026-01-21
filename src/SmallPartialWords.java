public class SmallPartialWords {
    public static int solution(String t, String p) {
        int answer = 0;
        long standardNumber = Long.parseLong(p);

        for(int i = 0; i <= t.length()-p.length(); i++) {
            if(standardNumber >= Long.parseLong(t.substring(i, i+p.length()))){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("10203","15"));
    }

}
