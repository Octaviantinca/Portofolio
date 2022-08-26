package ProiectNr7;

public class Electronic implements IntrerupatorOnOff{

    boolean on;

    public Electronic(){
        this.on = false;
    }
    @Override
    public String toString(){
        return "Electronic{" +
                "on=" + on +
                '}';
    }
    @Override
    public void turnOn() throws AlreadyOnException{
        if( this.on == false){
            this.on = true;
            System.out.println("Am pornit "+toString());
        } else {
            throw new AlreadyOnException("Este pornit");
        }
    }
    @Override
    public void turnOff() throws AlreadyOffException{
        if( this.on == true){
            this.on = false;
            System.out.println("Am oprit "+toString());
        } else {
            throw new AlreadyOffException("Este pornit");
        }
    }
}
