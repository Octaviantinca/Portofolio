package Proiect3MeniuPrajitura;

public class Meniu {
    Prajitura p;

    public <T> Meniu(Prajitura<T> p){
        this.p = p;
    }
    @Override
    public String toString(){
        return "prajitura cu " + this.p.tip.toString();
    }
}
