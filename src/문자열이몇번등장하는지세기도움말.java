public class 문자열이몇번등장하는지세기도움말 {
    public static int solution(String myString, String pat) {
        int answer = 0;
        int standardIdx = myString.length() -  pat.length()+1;

        for(int i = 0; i < standardIdx; i++) {
            String compStr = myString.substring(i, pat.length()+i);
            if(compStr.equals(pat))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution= " + solution("aaaa", "aa"));
    }
}
