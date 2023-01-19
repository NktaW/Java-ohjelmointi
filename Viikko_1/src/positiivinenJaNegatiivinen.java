import java.util.Random;
import java.util.Scanner;
/*Kirjoita ohjelma, joka kysyy käyttäjältä kokonaislukuja. 
Kun käyttäjä syöttää nollan, ohjelma tulostaa yhteensä syötettyjen positiivisten ja negatiivisten lukujen määrän.
Tämän jälkeen ohjelman suoritus päättyy. */





public class positiivinenJaNegatiivinen {
    public static void main(String[] args){
        final Random r = new Random();

        Scanner lukija = new Scanner(System.in);

        int positiivinen = 0;
        int negatiivinen = 0;

        while (true) {
            System.out.print("Anna luku: ");
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku>0) {
                positiivinen = positiivinen + 1;
            }
            if (luku<0) {
                negatiivinen = negatiivinen + 1;
            }
            if (luku==0) {
                System.out.println("Positiivisia: " + positiivinen);
                System.out.println("Negatiivisia: " + negatiivinen);
                break;
            }
        }
    }
}
