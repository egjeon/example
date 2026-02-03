import java.util.Arrays;

public class WordsCnt {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String[] arr = my_string.split("");
        String[] words = {
                "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
        };
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < answer.length; j++){
                if(arr[i].equals(words[j])){
                    if(answer[j]==0)
                        answer[j] = 1;
                    else
                        answer[j] +=1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new WordsCnt().solution("Programmers")));
    }


}
