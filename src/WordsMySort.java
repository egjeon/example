import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WordsMySort {
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        //방법1 O(n^2)
        /*for(int i = 0; i < strings.length; i++){
            for(int j = 0; j < strings.length; j++){
                if(strings[i].charAt(n) < strings[j].charAt(n)){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].compareTo(strings[j]) < 0){
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
           }
        }*/

        //방법2 //O(N)
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            words.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(words); //(NLOGN)

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
            answer[i] = words.get(i).substring(1, words.get(i).length());
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abcd", "cdx"}, 2)));

    }
}
