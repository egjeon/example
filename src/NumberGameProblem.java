public class NumberGameProblem {

    public static int solution(int a, int b, int c) {
        double dAnswer = a+b+c;
        if(a!=b && b!=c)
            dAnswer = Math.pow(dAnswer,1);

        if(a==b && b!=c || a==c && b!=c || b==c && a!=c)
            dAnswer = Math.pow(dAnswer,1)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));

        if(a==b && b==c)
            dAnswer = (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))*(a+b+c)*(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));


        int answer = (int)dAnswer;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2,6,1));
    }
}
