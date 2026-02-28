import java.util.HashSet;
import java.util.Iterator;

public class 주사위게임3 {
    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        if(set.size() == 1){
            answer = a*1111;
        }else if(set.size() == 2){
          if(a==b && b==c ){
                answer = ((10*a)+d)*((10*a)+d);
            }else if(a==c && c==d){
                answer = ((10*a)+b)*((10*a)+b);
            }else if(b==c && c==d){
                answer = ((10*b)+a)*((10*b)+a);
            }else if(d==a && a==b){
                answer = ((10*a)+c)*((10*a)+c);
            }else if(a==b && c==d){
                answer = ((a+c))*Math.abs(a-c);
            }else if(b==c && a==d) {
                answer = ((b+d))*Math.abs(b-d);
            }else if(b==d && a==c) {
              answer = ((b + a)) * Math.abs(b - a);
            }
        } else if(set.size()==3){
           if(a==b){
                answer = c*d;
            }else if(b==c){
                answer = a*d;
            }else if(c==d){
                answer = a*b;
            }else if(a==d){
                answer = b*c;
            }else if(b==d){
                answer = a*c;
            }else if(a==c) {
               answer = b * d;
           }
        } else{
            Iterator<Integer> it = set.iterator();
            int min = 6;
            while(it.hasNext()){
                int num = it.next();
                min = Math.min(min, num);
            }
            answer = min;
        }

        /*2222 size 1 그럼 그냥 2*1111 = > oK

         #size가 2인경우만 잘꺾자 a,b,c,d 활용
        1222 3개가같음 1,2 size 2 => 계산식..어떻ㄱ레 !? ㅏ어떻게알지 세개같은지 두개가같은지.. ㅗ금 어렵네
        1212 2개씩같음  1,2 size 2  ==>


            hash set 두개다 사이즈가2다..
         size가 만약 두개야 ? 그럼 int a,b,c,d a==b && b==c && c==a  원래 3개짜리읙식
            size만약 두갠대 a==b && c==d
                          b==c && a==d

        1,2,3,4 size = 4  moin 처리하머ㅕㄴ
        ㄱ럼 계싼식을?어떻ㄱ 1
*/
       /* if(a==b && a==c && a==d){
            answer = 1111*a;
        }else if(a==b && b==c ){
            answer = ((10*a)+d)*((10*a)+d);
        }else if(a==c && c==d){
            answer = ((10*a)+b)*((10*a)+b);
        }else if(b==c && c==d){
            answer = ((10*b)+a)*((10*b)+a);
        }else if(d==a && a==b){
            answer = ((10*a)+c)*((10*a)+c);
        }else if(a==b && c==d){
            answer = ((a+c))*Math.abs(a-c);
        }else if(b==c && a==d) {
            answer = ((b+d))*Math.abs(b-d);
        }else if(b==d && a==c){
            answer = ((b+a))*Math.abs(b-a);
        }else if(a==b){
            answer = c*d;
        }else if(b==c){
            answer = a*d;
        }else if(c==d){
            answer = a*b;
        }else if(a==d){
            answer = b*c;
        }else if(b==d){
            answer = a*c;
        }else if(a==c){
            answer = b*d;
        }else{
            int temp1 = Math.min(a,b);
            int temp2 = Math.min(c,d);
            answer = Math.min(temp1, temp2);
        }*/
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("solution() = " + solution(2,3,4,1));

    }
}
