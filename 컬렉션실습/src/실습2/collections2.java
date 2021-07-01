package ½Ç½À2;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class collections2 {
    
    public static void main(String srgs[]) {
        Vector<Integer> v = new Vector<Integer>();
        Random r = new Random();

        for(int i=0; i<10; i++) {
            v.add(r.nextInt(101)-50);
        }
        for(int i=0; i<v.size(); i++) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
        Collections.sort(v);
        for(int i=0; i<v.size(); i++) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println();      
    }
}