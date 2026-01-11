package kundenverwaltung;

public class NatuerlichePerson extends Person {

    private String geschlecht;
    private String anrede;

    public NatuerlichePerson(String name, String adresse, String geschlecht, String anrede) {
        super(name, adresse);
        this.geschlecht = geschlecht;
        this.anrede = anrede;
    }

    @Override
    public boolean istPremiumkunde() {
        return bisherigesBestellvolumen > 5000;
    }

    public void bestellungZurueckgeben(double betrag) {
        bisherigesBestellvolumen -= betrag;
        if (bisherigesBestellvolumen < 0) {
            bisherigesBestellvolumen = 0;
        }
    }
}
