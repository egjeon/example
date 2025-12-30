public class FlagConvertSumationProblem {
    public static int solution(int a, int b, boolean flag) {
        int answer = flag ? a+b : a-b ;
        return answer;
    }

    public static void main(String[] args) {
        solution(-4,7,true);
    }

}
