import java.util.Random;

public class TulostaMonta {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{"abc", 3}, {"moikka ",4}, {"*xyz",5}, {"-",15}};
        
        for (Object[] param : p) {
            System.out.println("Testataan parametreilla \"" + param[0] + "\", " + param[1]);
            tulostaMonta((String) param[0], (Integer) param[1]);
            System.out.println("");
        }
    }

    /*Kirjoita metodi

public static void tulostaMonta(String jono, int maara)

joka saa parametrikseen merkkijonon ja määrän. Metodi tulostaa annettua jonoa yhteen pötköön annetun määrän kertaa. */
  
    
    public static void tulostaMonta(String jono, int maara){
        int i = 0;
        while(i<maara){
            System.out.print(jono);
            i++;
        }
    System.out.println("");
    }

    
}
