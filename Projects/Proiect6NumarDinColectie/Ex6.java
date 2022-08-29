package Proiect6NumarDinColectie;
import java.util.*;

public class Ex6 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            set.add(s.nextInt());
        }
        int numarulDinColectie;

        while(true){
            System.out.println("Introduceti un numar din colectie: ");
            numarulDinColectie = s.nextInt();
            if(!set.contains(numarulDinColectie)) {
                System.out.println("Numarul nu este din colectie, introduceti un numar din colectie");
            } else {
                break;
            }
        }
        for(Integer i: set){
            if(numarulDinColectie < i){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Nu exista un element in colectie care sa fie mai mare decat numarul dat!");
    }
}
