import java.rmi.server.RemoteStub;
import java.util.Random;

import javax.lang.model.element.Element;
import javax.lang.model.util.ElementScanner14;

public class Keskimerkki {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        String[] s = "eka toka kolmonen neljä vekara testi aapinen kekkuli ohjelmointiopas tsukutsuku".split(" ");
        for (String pa : s) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println("Keskimerkki: " + keskimerkki(pa));
            System.out.println("");
        }
    }

/*  Kirjoita metodi

..joka palauttaa merkkijonon keskimmäisen merkin. 

Jos merkkijonossa kuitenkin on parillinen määrä merkkejä (eli keskimmäistä merkkiä ei ole), metodi palauttaa tyhjän viivan (eli miinusmerkin). */    


public static char keskimerkki(String jono) {
    char m = '-';
   if(jono.length() % 2 != 0){
    return jono.charAt(jono.length() / 2);
    }
    if(jono.length() % 2 == 0){
    return m;
    }
    return m;
}

}