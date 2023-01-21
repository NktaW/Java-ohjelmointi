import java.util.Random;

public class Kertoma {
    public static void main(String[] args){
        final Random r = new Random();
        
        int[] p = {2,3,4,6,1};
        for (int pa : p) {
            System.out.println("Testataan parametrin arvolla " + pa);
            System.out.println("Kertoma: " + kertoma(pa));
            System.out.println("");
        }
        
    }  
/*Kirjota metodi

kertoma(int luku)

joka laskee ja palauttaa kokonaislukuna annetun luvun kertoman.

Kertoma lasketaan kertomalla luku kaikilla itseään pienemmillä kokonaisluvuilla, esimerkiksi luvun 5 kertoma on 5 x 4 x 3 x 2 x 1. */

public static int kertoma(int luku){
    int vastaus = 1;
    int i;
    for(i = 1; i <= luku; i++) {
        vastaus = vastaus * i;
    } 
        return vastaus;
}

}