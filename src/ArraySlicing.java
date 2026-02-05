import java.util.Arrays;

public class ArraySlicing {
    public static int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length-1;
        //0짝 //1 홀 //2 짝 //3 홀  짝의경우 -> 해당하는거기준 뒤 다짜르기
        // 홀의 경우 해당하는거 기준 앞 다짜르기
        for (int i = 0; i < query.length; i++){//1 //2
            if(i % 2 == 0){
                      //1 +
                end = start + query[i]; //1 + 2
                System.out.println("end의 값 : " + end);
            }else{
                start = start + query[i]; //1
                System.out.println("start의 값 : " + start);
            }
        }

        return Arrays.copyOfRange(arr,start,end+1);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2})));
    }
}
