package ½Ç½À1;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class collections1 {
    
    public static void main(String srgs[]) {
        Vector<Integer> v = new Vector<Integer>();
        Random r = new Random();
        double sum = 0.0;
        for(int i=0; i<12; i++) {
            v.add(r.nextInt(100)+1);
        }
        for(int i=0; i<12; i++) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
        v.remove(2);
        v.remove(5);
        for(int i=0; i<10; i++) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
        v.set(0,r.nextInt(100)+1);
        v.set(7,r.nextInt(100)+1);
        for(int i=0; i<10; i++) {
            System.out.print(v.get(i)+" ");
            sum += v.get(i);
        }
        System.out.println();
        System.out.printf("ÇÕ: %d\n",(int)sum);
        System.out.printf("Æò±Õ: %.1f\n",sum/10);
    }
}