public class LimitNSummation {
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for(int a : numbers) {
            answer += a;
            if(answer > n)
                break;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}
