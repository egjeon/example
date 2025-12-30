public class ConditionWordsProblem {

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">")&&eq.equals("=")){
            if(n>=m)
                return 1;
        }else if(ineq.equals("<")&&eq.equals("=")){
            if(n<=m)
                return 1;
        }else if(ineq.equals(">")&&eq.equals("!")){
            if(n>m)
                return 1;
        }else if(ineq.equals("<")&&eq.equals("!")){
            if(n<m)
                return 1;

        }
        return answer;
    }

    public static void main(String[] args) {
        //System.out.println(solution("<","=",20,50));
        System.out.println(solution(">","!", 41,78));
    }
}
