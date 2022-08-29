package Proiect7IntrerupatorOnOff;

public interface IntrerupatorOnOff {

    abstract void turnOff() throws AlreadyOffException;

    abstract void turnOn() throws AlreadyOnException;
}
