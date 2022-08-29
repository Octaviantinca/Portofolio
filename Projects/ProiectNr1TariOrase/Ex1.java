package ProiectNr1TariOrase;
import java.util.*;

public class Ex1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        Map<Tara, List<Oras>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String pereche = s.nextLine();
            String[] cuvinte = pereche.split(" ");
            Tara t = new Tara(cuvinte[0]);
            Oras o = new Oras(cuvinte[1]);

            if(map.get(t) == null){
                map.put(t, new ArrayList<>());
            }

            List<Oras> listaOrase = map.get(t);
            listaOrase.add(o);
        }

        for(Tara tara: map.keySet()){
            System.out.println(tara.nume);

            for(Oras oras: map.get(tara)){
                System.out.print(oras.nume+" ");
            }
            System.out.println();
        }
    }
}
