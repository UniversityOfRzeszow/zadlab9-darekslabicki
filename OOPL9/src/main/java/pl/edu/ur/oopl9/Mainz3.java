package pl.edu.ur.oopl9;

import java.util.ArrayList;

public class Mainz3 {

    public static void main(String[] args) {
        Samochody s1 = new Samochody();
        Samochody s2 = new Samochody("a", "b", 19000, 200);
        Samochody s3 = new Samochody("asd", "dsa", 20000, 250);
        s1.setMarka("marka");
        s1.setCena(25000);
        s1.setMaxpredkosc(230);
        s1.setNazwa("nazwa");
        ArrayList<Samochody> arlist = new ArrayList<>();

        arlist.add(s1);
        arlist.add(s2);
        arlist.add(s3);
        for (int i = 0; i < arlist.size(); i++) {
            System.out.println("ArrayList Element " + (i + 1) + ": " + arlist.get(i).getNazwa() + ", " + arlist.get(i).getMarka() + ", " + arlist.get(i).getCena() + ", " + arlist.get(i).getMaxpredkosc());
        }

    }
}
