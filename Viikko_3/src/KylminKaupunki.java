import java.util.Random;
import java.util.Set;
import java.lang.annotation.Retention;
import java.util.HashMap;

public class KylminKaupunki {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        for (int testi=1; testi<=3; testi++) {
            System.out.println("Testi " + testi);
            String[] kaup = "Turku Helsinki Tampere Rovaniemi Oulu Kajaani Jyväskylä Pori Vaasa".split(" ");
            HashMap<String, Double> lt = new HashMap<>();
            double[] add = {0, 0.25, 0.5, 0.75};
            
            for (String kaupunki : kaup) {
                double l = 25 - r.nextInt(50);
                l += add[r.nextInt(4)];
                
                lt.put(kaupunki, l);
            }
            
            System.out.println("Lämpötilat: ");
            System.out.println("" + lt);
            System.out.println("Kylmin kaupunki: " + kylminKaupunki(lt));
            System.out.println("");
        }
    }

        public static String kylminKaupunki(HashMap<String, Double> lampotilat){
            double kylmin = 9999999;
            String kaupunki = "";

            for(String avain : lampotilat.keySet()){
                    if (kylmin > lampotilat.get(avain)){
                        kylmin = lampotilat.get(avain);
                        kaupunki = avain;
                    }
                }
            return kaupunki;
        }

    
}



/*  public static String kylminKaupunki(HashMap<String, Double> lampotilat){
        String kylmin = "";
        for(String avain : lampotilat.keySet()){
            if(lampotilat.get(avain) <= -999);
            kylmin = avain;
        }
        return kylmin;
    }
 */