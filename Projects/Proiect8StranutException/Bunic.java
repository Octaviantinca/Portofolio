package Proiect8StranutException;

public class Bunic extends Om{

    public Bunic(String nume){
        super(nume);
    }
    @Override
    public void aStranutat(String cuvant) throws StranutZgomotosException{
        if(cuvant.equals("hapciu")){
            System.out.println("Bunicul < "+this.nume+" > a stranutat");
        }
    }
}
