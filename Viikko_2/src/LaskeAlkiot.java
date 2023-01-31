import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class LaskeAlkiot {
    public static void main(String[] args){
        final Random rnd = new Random();
        
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi numero " + testi);
            ArrayList<Integer> luvut = new ArrayList<>();
            
            int pituus = 10 + rnd.nextInt(15);
            for (int i=0; i<pituus; i++) {
                luvut.add(15 - rnd.nextInt(30));
            }
            
            System.out.println("Lista: " + luvut);

            /*Ohjelmassa on valmiiksi alustettu listamuuttuja luvut, joka osoittaa kokonaislukutyyppiseen listaan.

            Tehtäväsi on laskea kuinka monta negatiivista ja kuinka monta positiivista alkiota listassa on. */

            int negatiiviset = 0;
            int positiiviset = 0;

            for(int luku : luvut){
                System.out.println(luku);
                if(luku <= -1){
                    negatiiviset += 1;
                }
                if(luku >= 0){
                    positiiviset += 1;
                }

            }
            System.out.println("Positiivisia: " + positiiviset);
            System.out.println("Negatiivisia: " + negatiiviset);
            
        }


        
    }
}


