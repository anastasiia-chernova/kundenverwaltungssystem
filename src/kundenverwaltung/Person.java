package kundenverwaltung;

public abstract class Person {

    protected String name;
    protected String adresse;
    protected double bisherigesBestellvolumen;
    protected int anzahlBestellungen;

    public Person(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
        this.bisherigesBestellvolumen = 0;
        this.anzahlBestellungen = 0;
    }

    public void ergaenzeBestellung(double betrag) {
        bisherigesBestellvolumen += betrag;
        anzahlBestellungen++;
    }

    public double berechneWichtigkeit() {
        return bisherigesBestellvolumen + anzahlBestellungen * 100;
    }

    public abstract boolean istPremiumkunde();

    public String getName() {
        return name;
    }
}
