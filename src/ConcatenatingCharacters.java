public class ConcatenatingCharacters {

    public static String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i = 0; i < index_list.length; i++){
            answer += my_string.charAt(index_list[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("cvsgiorszzzmrpaqpe",new int[]{16,6,5,3,12,14,11,11,17,12,7}));
    }
}
