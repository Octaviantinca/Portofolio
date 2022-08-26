package ProiectNr5;
import java.util.*;

public class Ex5 {
    public static void main(String[] args){

        Map<String, Angajat> map = new HashMap<>();
        map.put("1234567890", new Angajat("Maria", "1234567890", 500));
        map.put("1234567891", new Angajat("Ioana", "1234567891", 900));
        map.put("1234567892", new Angajat("Marius", "1234567892", 1500));
        map.put("1234567893", new Angajat("Ionut", "1234567893", 2500));

        for(String s: map.keySet()){
            System.out.println(map.get(s));
        }
    }
}
