package ProiectNr8;

public class Om{

    String nume;

    public Om(String nume){
            this.nume = nume;
            }
    public void aStranutat(String cuvant) throws StranutException{
        if(cuvant.equals("hapciu")){
        throw new StranutException("< "+this.nume+" > a stranutat");
        }
    }
    public void vorbeste(String[] cuvinte){
        System.out.println("< "+this.nume+" > spune: ");

        for(String cuvant: cuvinte) {
            try {
                this.aStranutat(cuvant);
                System.out.println(cuvant);
            } catch (StranutException e) {
                System.out.println(e.getMessage());
            }

         }
    }

}
