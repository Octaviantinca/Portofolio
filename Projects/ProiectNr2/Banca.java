package ProiectNr2;
import java.util.*;

public class Banca {

    Map<String, Client> clienti = new HashMap<>();

    public void adaugaClient(Client c){
        //verificam ca nu exista un client cu acelasi CNP
        for(Client client: clienti.values()){
            if(client.cnp.equals(c.cnp)){
                throw new ClientExistentException("Acest client exista deja in gestiunea bancii");
            }
        }

        String codUnic = determinaCodUnic(c);

        if(clienti.get(codUnic)==null){
            clienti.put(codUnic, c);
        }
    }

    private String determinaCodUnic(Client c){
        StringBuilder sb = new StringBuilder();

        sb.append(c.cnp.substring(9,13));
        char[] litereNume = c.nume.toCharArray();
        int sumaLitere = litereNume[0] + litereNume[1];

        sb.append(sumaLitere);

        return sb.toString();
    }
}
