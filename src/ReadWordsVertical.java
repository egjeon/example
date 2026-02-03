public class ReadWordsVertical {

    public static String solution(String my_string, int m, int c) {
        int stanDardIdx = my_string.length()/m;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= stanDardIdx; i++){
            sb.append(my_string.substring(c-1,c));
            my_string = my_string.substring(m,my_string.length());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("programmers",1,1));
    }

}
