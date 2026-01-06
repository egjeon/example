public class WordsSliceNprb {
    public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(my_string.length()-n, my_string.length());
        return answer;
    }

    public static void main(String[] args) {
        WordsSliceNprb sl = new WordsSliceNprb();
        System.out.println(sl.solution("ProgrammerS123",11));
    }

}
