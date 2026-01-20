public class MoneyOfLackCalculation {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        for(long i = 1; i <= count; i++){
            answer += price*i;
        }

        answer -= money;
        if(answer >=0){
            return answer;
        }else{
            answer=0;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2500,1000000000,2500));
    }
}
