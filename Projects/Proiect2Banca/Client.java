package Proiect2Banca;
import java.util.*;

public class Client {

    String nume;
    String cnp;
    List<Cont> conturi = new ArrayList<>();

    public Client(String nume, String cnp){
        this.nume = nume;
        this.cnp = cnp;
    }
    public void deschideCont(double sumaInitiala){
        conturi.add(new Cont(sumaInitiala));
    }

    @Override
    public String toString(){
        String conturiString = "";
        for(Cont cont: conturi){
            conturiString = conturiString + "Cont: "+cont.sold+", ";
        }
        return "Clientul: "+this.nume+" "+this.cnp+" "+conturiString;
    }
}
