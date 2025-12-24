import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
*  1  ≤ num_list의 길이 ≤ 1,000
 * 0 ≤ num_list의 원소 ≤ 999
 * 입출력 예
 * num_list   result
 * [1, 2, 3, 4, 5]   [5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2]   [2, 1, 1, 1, 1, 1]
 * [1, 0, 1, 1, 1, 3, 5]   [5, 3, 1, 1, 1, 0, 1]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
 * 입출력 예 #2
 *
 * num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
 * 입출력 예 #3
 *
 * num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
public class ArrTest {
/*
    public static void printReverseArr(int [] arr){
        int [] reverseArr = new int[arr.length];
        int reverseIndex = arr.length-1;
        for(int i=0; i < arr.length; i++){
            reverseArr[reverseIndex--] = arr[i];

        }
        for(int i=0; i < reverseArr.length; i++){

        }
        System.out.println(reverseArr[3]);
    }
*/
    public void sortedArrAsc(int []arr){
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {7, 4, 9, 0, 2};
        ArrTest arrTest = new ArrTest();
        arrTest.sortedArrAsc(arr);
    }
}
