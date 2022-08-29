package Proiect5Angajat;

public class Angajat {
    String nume;
    String cnp;
    int salariu;

    public Angajat(String nume, String cnp, int salariu){
        this.nume = nume;
        this.cnp = cnp;
        this.salariu = salariu;
    }
    @Override
    public String toString(){
        return "Nume: " + this.nume+"\n" +
                "CNP: " + this.cnp+"\n" +
                "Salariu: " + this.salariu;
    }
}
