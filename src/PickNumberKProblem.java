import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//i,j,k
// i= 2 , j = 5, k = 3 2~5 3번째
// i=4, j=4, k=1 4~4번 1번째 담아
// i=1, j=7, k=3 1~7번까지 정렬해 3번째숫자를 담아

public class PickNumberKProblem {
    public static int[] solution(int[] array, int[][] commands) {

        List<Integer> originList = new ArrayList<>();
        for(int i = 0; i < commands.length; i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j = commands[i][0]-1; j <= commands[i][1]-1; j++){
                tempList.add(array[j]);
            }

            Collections.sort(tempList);
            originList.add(tempList.get(commands[i][2]-1));

        }
        int [] answer = new int[originList.size()];

        for(int i = 0; i < originList.size(); i++){
            answer[i] = originList.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4} ,new int[][]{{2,5,3},{4,4,1},{1,7,3}})));
    }
}

