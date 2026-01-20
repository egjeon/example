public class RemaindToOne {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <=n; i++){
            if(i % n == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }

}
