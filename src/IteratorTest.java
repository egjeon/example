import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int [] arr = {1,4,5,6,6,8,7,4,4,1,1,3};

        for(int i=0;i<arr.length;i++)
            set.add(arr[i]);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
           int temp = iterator.next();
           System.out.print(temp+  " ");
        }

    }
}
