import java.util.ArrayList;
import java.util.Arrays;

public class CuttingList {

    public static int[] solution(int n, int[] slicer, int[] num_list) {

        int[] answer = {};

        switch (n) {
            case 1:
                answer = new int[slicer[1] + 1];
                System.arraycopy(num_list, 0, answer, 0, answer.length);
                break;
            case 2:
                answer = new int[num_list.length - slicer[0]];
                System.arraycopy(num_list, slicer[0], answer, 0, answer.length);
                break;
            case 3:
                answer = new int[slicer[1] - slicer[0] + 1];
                System.arraycopy(num_list, slicer[0], answer, 0, answer.length);
                break;
            default:
                answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
                int idx = slicer[0];

                for (int i = 0; i < answer.length; i++) {
                    answer[i] = num_list[idx];

                    idx+=slicer[2];
                }
        }

        return answer;


        /*int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        switch(n){
            case 1 :
                for(int i = 0; i <= slicer[1]; i++)
                    list.add(num_list[i]);
                break;
            case 2 :
                for(int i = slicer[0]; i < num_list.length; i++)
                    list.add(num_list[i]);
                break;
            case 3 :
                for(int i = slicer[0]; i <= slicer[1]; i++)
                    list.add(num_list[i]);
                break;
            case 4 :
                int idx = slicer[2];
                for(int i = slicer[0]; i <= slicer[1]; i++){
                    if(idx % slicer[2] == 0){
                        list.add(num_list[i]);
                    }
                    idx++;
                }
                break;
        }
        answer = new int[list.size()];

        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;*/
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4,new int[]{1,5,2},new int[]{1,2,3,4,5,6,7,8,9})));
    }
}
