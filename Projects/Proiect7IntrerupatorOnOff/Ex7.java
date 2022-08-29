package Proiect7IntrerupatorOnOff;

public class Ex7 {
    public static void main(String[] args){

        Tv tv = new Tv();
        Laptop laptop = new Laptop();
        Boxa boxa = new Boxa();

        try {
            tv.turnOn();
            laptop.turnOn();
            boxa.turnOn();
        } catch(AlreadyOnException e){
            System.out.println(e.getMessage());
        }
        try {
            tv.turnOff();
            laptop.turnOff();
            boxa.turnOff();
        } catch(AlreadyOffException e){
            System.out.println(e.getMessage());
        }
    }
}
