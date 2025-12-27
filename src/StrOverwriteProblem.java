public class StrOverwriteProblem {
    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+overwrite_string.length(),my_string.length());
        return answer;
    }
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        System.out.println(solution(my_string,overwrite_string,2));

    }
}
