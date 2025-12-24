import java.util.Scanner;

public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int angle1 = sc.nextInt();
            int angle2 = sc.nextInt();
            angle1 = angle1%360;angle2 = angle2%360; if(angle1+angle2 >= 360) angle1 -= 360;
            System.out.println("A" + angle1);
            System.out.println("B" + angle2);
            /*while (angle1 > 360){angle1 -= 360;}while (angle2 > 360){angle2 -= 360;}if(angle1+angle2 >= 360){if(angle1 > angle2){angle1 -=360;}else{angle2 -=360;}}*/
            int sum_angle = angle1 + angle2;
            System.out.println(sum_angle);
        }
}