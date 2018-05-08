package pl.edu.ur.oopl9;

import java.util.Random;
import java.util.TreeSet;

public class TreeSett {

    public static void main(String[] args) {
        Random r = new Random();
        TreeSet t = new TreeSet();
        for (int i = 0; i < 101; i++) {
            t.add(r.nextInt(100));
        }
        System.out.println(t);
    }

}
