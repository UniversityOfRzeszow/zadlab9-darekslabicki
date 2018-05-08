package pl.edu.ur.oopl9;

public class Samochody {

    private String marka;
    private String nazwa;
    private int cena;
    private int maxpredkosc;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getMaxpredkosc() {
        return maxpredkosc;
    }

    public void setMaxpredkosc(int maxpredkosc) {
        this.maxpredkosc = maxpredkosc;
    }

    public Samochody() {
        this("", "", 0, 0);
    }

    public Samochody(String marka, String nazwa, int cena, int maxpredkosc) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.cena = cena;
        this.maxpredkosc = maxpredkosc;
    }

}
