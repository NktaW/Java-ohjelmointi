import java.util.Random;

public class AnnaVoitto {
    private static Random rnd;
    
    public static void main(String[] args){
        rnd = new Random();
        
        
        double[] p = {100.0, 25.0, 5.50, 0.50};
        for (double pa : p) {
            System.out.println("Testataan parametrilla " + pa);
            System.out.println("Voitto: " + annaVoitto(pa));
            System.out.println("");
        }
        
    }

    /*Kasinon uudessa hedelmäpelissä voitto määräytyy kertomalla pelaajan panos satunnaisella voittokertoimella.

    Kirjoita metodi

    double annaVoitto(double panos) 

    ...joka palauttaa pelaajan voiton. Ohjelmassa valmiiksi määritelty metodi annaKerroin() palauttaa voittokertoimen kokonaislukuna. */
    
    public static int annaKerroin() {
        return rnd.nextInt(5) + 1;
    }

    public static double annaVoitto(double panos) {
        return panos * annaKerroin();   
    }        

}
