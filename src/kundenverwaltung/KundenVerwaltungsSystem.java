package kundenverwaltung;

import java.util.ArrayList;
import java.util.List;

public class KundenVerwaltungsSystem {

    public static void main(String[] args) {

        List<Person> kunden = new ArrayList<>();

        NatuerlichePerson p1 = new NatuerlichePerson("Anna Müller", "Berlin", "weiblich", "Frau");
        NatuerlichePerson p2 = new NatuerlichePerson("Max Schmidt", "Hamburg", "männlich", "Herr");

        JuristischePerson f1 = new JuristischePerson("Tech GmbH", "München", "GmbH", true);
        JuristischePerson f2 = new JuristischePerson("Büro AG", "Köln", "AG", true);

        kunden.add(p1);
        kunden.add(p2);
        kunden.add(f1);
        kunden.add(f2);

        p1.ergaenzeBestellung(3000);
        p1.ergaenzeBestellung(2500);

        p2.ergaenzeBestellung(1000);

        f1.ergaenzeBestellung(15000);
        f2.ergaenzeBestellung(8000);

        for (Person k : kunden) {
            System.out.println(k.getName()
                    + " | Premium: " + k.istPremiumkunde()
                    + " | Wichtigkeit: " + k.berechneWichtigkeit());
        }
    }
}
