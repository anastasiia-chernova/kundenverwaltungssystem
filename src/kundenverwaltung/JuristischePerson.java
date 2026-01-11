package kundenverwaltung;

public class JuristischePerson extends Person {

    private String rechtsform;
    private boolean istKapitalgesellschaft;

    public JuristischePerson(String name, String adresse, String rechtsform, boolean istKapitalgesellschaft) {
        super(name, adresse);
        this.rechtsform = rechtsform;
        this.istKapitalgesellschaft = istKapitalgesellschaft;
    }

    @Override
    public boolean istPremiumkunde() {
        if (istKapitalgesellschaft) {
            return bisherigesBestellvolumen > 10000;
        }
        return bisherigesBestellvolumen > 20000;
    }
}
