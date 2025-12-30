public class BigNumberProblem2 {
    public int solution(int a, int b) {
        int answer = 0;
        String strVal = String.valueOf(a) + String.valueOf(b);
        int mulVal = 2*a*b;
        answer = mulVal > Integer.parseInt(strVal) ? mulVal : Integer.parseInt(strVal);

        return answer;
    }
    public static void main(String[] args) {
        BigNumberProblem2 obj = new BigNumberProblem2();
        System.out.println(obj.solution(11, 22));
    }
}
