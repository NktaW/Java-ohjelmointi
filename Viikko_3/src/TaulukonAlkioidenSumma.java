import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class TaulukonAlkioidenSumma {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            
            int pituus = r.nextInt(5) + 5;
            int[] taulu = new int[pituus];
            for (int i=0; i<pituus; i++) {
                taulu[i] = r.nextInt(10) + 1;
            }
            
            System.out.println("Taulukko: " + Arrays.toString(taulu));
            System.out.println("Summa: " + summa(taulu));
            System.out.println("");
        }
    }

    public static int summa(int[] luvut){
        int summa = 0;
        for(int i : luvut){
            summa += i;

        }
        return summa;
    
    }

    
}
