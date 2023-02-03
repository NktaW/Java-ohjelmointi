import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class YhdistaNimetJaArvosanat {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] nn = "Jarmo Jouko Liisa Leena Maija Kimmo".split(" ");
        
        ArrayList<String> nimet = new ArrayList<>();
        ArrayList<Integer> arvosanat = new ArrayList<>();
        
        for (String nimi : nn) {
            nimet.add(nimi);
            arvosanat.add(r.nextInt(7) + 4);
        }
        
        System.out.println("Nimet: " + nimet);
        System.out.println("Arvosanat: " + arvosanat);
        System.out.println("Yhdistetty: ");
        
        HashMap<String, Integer> taulu = yhdista(nimet, arvosanat);
        
        for (String nimi : nimet) {
            System.out.println(nimi + ": " + taulu.get(nimi));
        }
        
    }

    /*Kirjoita metodi

public static HashMap<String, Integer> yhdista(ArrayList<String> nimet, ArrayList<Integer> arvosanat)

joka saa parametrikseen listan nimiä ja arvosanoja. Muodosta ja palauta nimistä ja arvosanoista uusi hajautustaulu, jossa nimet toimivat avaimina ja arvosanat arvoina.

Nimet ja arvosanat ovat listoissa vastaavien indeksien kohdalla (eli esim. ensimmäinen nimi ja ensimmäinen arvosana kuuluvat yhteen). */

    public static HashMap<String, Integer> yhdista(ArrayList<String> nimet, ArrayList<Integer> arvosanat){
        HashMap<String, Integer> tiedot = new HashMap<String, Integer>();

        for(int i = 0; i < nimet.size(); i++){

            tiedot.put(nimet.get(i),arvosanat.get(i));
        }
        return tiedot;
    }
    
}
