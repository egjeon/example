import java.util.Arrays;

public class PickNumberProblem2 {
    public static int[] solution(int [] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int first = commands[i][0];
            int second = commands[i][1];
            int k = commands[i][2];
            int [] newArray = new int[second-first+1];

            System.arraycopy(array, first-1, newArray, 0,second-first+1);
            Arrays.sort(newArray);

            answer[i] = newArray[k-1];

        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4} ,new int[][]{{2,5,3},{4,4,1},{1,7,3}})));
    }
}
