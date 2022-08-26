package ProiectNr3;
import java.util.*;

public class Ex3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Ciocolata ciocolata = new Ciocolata();
        Mar mar = new Mar();

        Prajitura<Ciocolata> p1 = new Prajitura(ciocolata);
        Prajitura<Mar> p2 = new Prajitura(mar);

        String zi = sc.nextLine();
        Meniu m;

        switch(zi) {
            case "luni":
                m = new Meniu(p1);
                System.out.println(m);
                break;
            case "marti":
                m = new Meniu(p2);
                System.out.println(m);
                break;

        }

    }
}
