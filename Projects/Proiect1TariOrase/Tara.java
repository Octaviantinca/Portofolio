package Proiect1TariOrase;

public class Tara {
    String nume;

    public Tara(String nume){
        this.nume = nume;

    }

    @Override
    public boolean equals(Object o){ //pentru a putea folosi Obiectele ca si chei in Map
        if(o == null){
            return false;
        }
        if(!(o instanceof Tara)){
            return false;
        }

        Tara t = (Tara) o;

        if(this.nume.equals(t.nume)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return this.nume.hashCode();
    }
}
