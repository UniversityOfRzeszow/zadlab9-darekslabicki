package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;

public class z1 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] tab = new int[100];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = r.nextInt(100);
        }
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }

}
