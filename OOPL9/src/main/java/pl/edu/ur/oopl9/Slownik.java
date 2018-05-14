package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slownik {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        String c;
        Map<String, String> slownik = new HashMap<>();
        slownik.put("tak", "yes");
        slownik.put("nie", "no");
        slownik.put("dień dobry", "good morning");
        slownik.put("mama", "mom");
        slownik.put("tata", "dad");
        slownik.put("brat", "brother");
        slownik.put("siostra", "sister");
        slownik.put("dziecko", "child");
        slownik.put("przyjaciel", "friend");
        slownik.put("dom", "home");
        slownik.put("kot", "cat");
        slownik.put("pies", "dog");
        slownik.put("wróbel", "sparrow");
        slownik.put("chleb", "bread");
        slownik.put("krzesło", "chair");
        slownik.put("światło", "light");
        slownik.put("oko", "eye");
        slownik.put("twarz", "face");
        slownik.put("nos", "nose");
        slownik.put("ucho", "ear");
        do {
            System.out.println("Podaj słowo do przetłumaczenia: ");
            c = v.nextLine();
            if (slownik.containsKey(c)) {
                System.out.println("Przetlumaczone: " + slownik.get(c));
            } else {
                System.out.println("Nie ma takiego słowa w naszym słowniku!");
            }
            System.out.println("-----------------------------------------");
        } while (!c.equalsIgnoreCase("koniec"));

    }

}
