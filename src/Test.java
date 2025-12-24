import java.util.Scanner;

public class Test {

/*

    my_string	n	result
    "ProgrammerS123"	11	"ProgrammerS"
        "He110W0r1d"	5	"He110"



*/




    public String solution(String my_string, int n)
    {
        String [] my_string1 = my_string.split("");
        String answer = "";
        for(int i = 0; i< n; i++){
            answer += my_string1[i];
        }


        return answer;
    }

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String my_string = scanner.next();
        int n = scanner.nextInt();
        Test test = new Test();
        System.out.println(test.solution(my_string, n));

    }*/
}
