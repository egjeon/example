public class BigNumberProblem {
    public int solution(int a, int b) {
        int answer = 0;
        int sum1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sum2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
/*
        if(sum1 - sum2 > 0){
            return sum1;
        }else{
            return sum2;
        }*/
         //answer = Math.max(sum1, sum2);

        //answer = sum1 > sum2 ? sum1 : sum2;

        return answer;
    }


    public static void main(String[] args) {
     BigNumberProblem bnp = new BigNumberProblem();
     System.out.println(bnp.solution(79, 8));
    }
}
