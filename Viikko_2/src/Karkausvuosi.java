import java.util.Random;
import java.util.Scanner;


public class Karkausvuosi {
    public static void main(String[] args){
        final Random r = new Random();
            karkausvuodet();
    }
    public static boolean onkoKarkausvuosi(int vuosi) {
        if (vuosi % 4 != 0){
            return false;
        } 
            
        if (vuosi % 400 == 0) {
            return true;
        }
            
        if (vuosi % 100 == 0){
            return false;
            
        }
        return true;
    } 
        
    public static void karkausvuodet(){
        Scanner lukija = new Scanner(System.in);
    
        System.out.print("Anna alku: ");
        int alku = Integer.valueOf(lukija.nextLine());
    
        System.out.print("Anna loppu: ");
        int loppu = Integer.valueOf(lukija.nextLine());
    
        for(int vuosi = alku; vuosi <= loppu; vuosi++){
            boolean onko = onkoKarkausvuosi(vuosi);
    
            if(onko){
                System.out.println(vuosi+" on karkausvuosi");
            }
        }
    
    }

}
