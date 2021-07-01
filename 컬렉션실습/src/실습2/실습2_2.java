import java.util.Collections;
import java.util.Random;
import java.util.Vector;
import java.util.PriorityQueue;

public class ½Ç½À2_2 {
    
    public static void main(String srgs[]) {
        Vector<Integer> v = new Vector<Integer>();
        Random r = new Random();
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for(int i=0; i<10; i++) {
            v.add(r.nextInt(101)-50);
        }
        Collections.sort(v);
        System.out.println(v);
        
        for(int i=0; i<10; i++) {
            p.offer(r.nextInt(101)-50);
        }
        System.out.println(p);    
    }
}