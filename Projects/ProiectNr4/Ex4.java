package ProiectNr4;
import java.util.*;

public class Ex4 {
    public static void main(String[] args){
        List<Tara> tari = new ArrayList<>();
        tari.add(new Tara("Romania", "Bucuresti", 18888888));
        tari.add(new Tara("Germania", "Berlin", 67087668));
        tari.add(new Tara("Turcia", "Ankara", 80998877));
        tari.add(new Tara("Spania", "Madrid", 56999555));
        tari.add(new Tara("Estonia", "Tallinn", 7000865));

        tari.stream()
                .filter(tara -> tara.locuitori > 30000000)
                .forEach(tara -> System.out.println(tara.nume));

    }
}
