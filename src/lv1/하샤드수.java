package lv1;

public class 하샤드수 {
    public static boolean solution(int x) {
        boolean answer = false;
        String [] arr = String.valueOf(x).split("");
        int divNum = 0;

        for(int i=0;i<arr.length;i++)
            divNum += Integer.parseInt(arr[i]);

        if(x%divNum==0)
            answer = true;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
