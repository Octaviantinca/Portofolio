package ProiectNr2;

public class Ex2 {

    public static void main(String[] args){

        Banca banca = new Banca();
        Client c1 = new Client("Ana","1234567890000");
        Client c2 = new Client("Marius","1234567890001");
        Client c3 = new Client("Serban","1234567890000");

        c1.deschideCont(2000);

        c2.deschideCont(0);
        c2.deschideCont(1000);
        c2.deschideCont(12345);

        c3.deschideCont(5000);

        banca.adaugaClient(c1);
        banca.adaugaClient(c2);
        //banca.adaugaClient(c3); //c1 si c3 au acelasi CNP -> exception

        for(String codUnic: banca.clienti.keySet()){
            System.out.println(banca.clienti.get(codUnic));
        }

    }
}
