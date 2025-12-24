import java.util.ArrayList;
import java.util.Arrays;

public class CreateSpecialWord {
    public static int[] solution(int l, int r) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        boolean flag = true;
        while(l<=r){
            if(l%5 ==0){
                strList.add(String.valueOf(l));
            }
            l++;
        }
        for(int i=0; i<strList.size(); i++){
            for(int j=0; j<strList.get(i).length(); j++){
                if(strList.get(i).charAt(j) != '0' && strList.get(i).charAt(j) != '5'){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            if(flag){
                intList.add(Integer.parseInt(strList.get(i)));
            }
        }
        int[] answer = new int [intList.size()];

        if(intList.size()==0){
            return new int[]{-1};
        }
        for(int i = 0; i< answer.length; i++){
            answer[i] = intList.get(i);
        }


        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(5,555));
    }
}
