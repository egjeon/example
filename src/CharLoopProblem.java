import java.util.Scanner;

public class CharLoopProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String [] str = a.split("");
        for(int i = 0; i < str.length; i++)
            System.out.println(str[i]);
        System.out.println();
        for(int i = 0; i<a.length();i++)
            System.out.println(a.charAt(i));
    }
}
