package ProiectNr8;

public class Ex8 {
    public static void main(String[] args){

        Om om = new Om("George");
        Bunic bunic = new Bunic("Stefan");

        String[] cuvinte = {"Buna","ziua","ce", "mai", "hapciu", "faceti"};

        om.vorbeste(cuvinte);
        bunic.vorbeste(cuvinte);

    }
}
