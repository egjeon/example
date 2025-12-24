import java.util.Scanner;

public class Test3 {
    /*
      3*4*5*2*1  (3+4+5+2+1)^2
              120  > 225  true  1
              false 0
                                */

    public int solution(int[] num_list) {
        int answer = 0;

        int sum = 0;
        int multiply = 0;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            multiply *= num_list[i];
        }

        sum = sum * sum;
        if (sum < multiply) {
            answer = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(new Test3().solution(arr));
    }
}
