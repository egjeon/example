public class ChangeUpperCaseWord {
    public static String solution(String my_string, String alp) {
        String answer = "";
        String [] arr = my_string.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(alp)){
                answer += arr[i].toUpperCase();
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("programmers","p"));
    }
}
