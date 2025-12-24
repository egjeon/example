import java.util.Scanner;

public class Main {
    /**
     *  *
     *  ****
     *  *****
     * @param args
     */
    /**
     *       *             0   1 별의갯수         0   3       spacebar
     *      ***            1   3                1   2
     *     *****           2   5                2   1
     *    *******          3   7                3   0
     *   *********       5
     *    *******    i=0 7            0-3           spacebar
     *     *****     i=1 5           3-0   -3/3 = -1  4  2
     *      ***      i=2 3                            3  3
     *       *       i=3 1       output = 2*i+1   -(x-4)+1
     *                       5  4                  -(x-4)+2  -
     */
    public static void printUpperStar(int n,String result, String space){
        for(int i = 0; i < n; i++){

            for(int k = 0; k < -i+n; k++){
                space += " ";
            }
            for(int j = 0; j < 2*i+1; j++){
                result += "*";
            }
            System.out.println(space + result);
            result = "";
            space = "";
        }
    }
    public static void printLowerStar(int n, String result, String space){
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j <  2*i-1;j++){
                result += "*";
            }
            for(int k = 0; k < -i+(n+1); k++){
                space += " ";
            }
            System.out.println(space+result);
            result = "";
            space = "";

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        String result = "";
        String space = "";
        printUpperStar(n, result, space);
        printLowerStar(n, result, space);

    }
}
