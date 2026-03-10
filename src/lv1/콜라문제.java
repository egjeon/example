package lv1;

public class 콜라문제 {

    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) { //10*1
            int temp = (n / a) * b; //10 // 5 // 3 // 1
            int reminder = n % a; // 0 // 1 //0 // 1 //0
            answer += temp; // 10 + 5 + 3 + 1  19
            n = temp + reminder; //1+1= 2
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3,1,20));
    }

}
