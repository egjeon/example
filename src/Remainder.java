import java.math.BigDecimal;
import java.math.BigInteger;

public class Remainder {
    public int solution(String number) {
        int answer = 0;
        /*String [] strArr = number.split("");
        for(int i = 0; i < strArr.length; i++)
            answer += Integer.parseInt(strArr[i]);*/
        /*answer = answer % 9;*/

        return new BigInteger(number).remainder(new BigInteger(number).valueOf(9)).intValue();
    }

    public static void main(String[] args) {
        Remainder r = new Remainder();
        System.out.println(r.solution("78720646226947352489"));

    }
}
