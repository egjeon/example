import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueTest {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<String>();
            //큐는 선입선출 First In First Out
            //스택 Last In First out
        q.offer("A");
        q.offer("B");
        q.offer("C");
        q.offer("D");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        Iterator<String> it = q.iterator();
        /*while(it.hasNext()){
            System.out.println(it.next());
        }*/


    }
}
