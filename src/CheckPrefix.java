public class CheckPrefix {

    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        String sliceStr = "";
        if(my_string.length() < is_prefix.length()){
            answer = 0;
        }else{
            sliceStr = my_string.substring(0,is_prefix.length());
            if(sliceStr.equals(is_prefix)){
                answer = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana","bananan"));
    }

}
