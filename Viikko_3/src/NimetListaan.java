import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class NimetListaan {
    public static void main(String[] args){
        final Random r = new Random();

        /*Kirjoita ohjelma, joka kyselee käyttäjältä nimiä. Annetut nimet lisätään listaan.

            Jos nimi kuitenkin on jo listassa, sitä ei lisätä sinne uudestaan vaan tulostetaan käyttäjälle virheviesti. 

            Kun käyttäjä antaa nimeksi "lopeta", tulostetaan nimilista ja ohjelman suoritus päättyy. */
    
    ArrayList<String> lista = new ArrayList<>();
    
    Scanner lukija = new Scanner(System.in);

        while(true){
            System.out.print("Anna nimi: ");
            String nimi = String.valueOf(lukija.nextLine());

            if(!lista.contains(nimi) && !nimi.equals("lopeta")){
                lista.add(nimi);
                System.out.println("Moi, " + nimi);
                //System.out.println(lista);
            }
            else if(lista.contains(nimi)){
                System.out.println("Nimi on jo annettu.");
                //System.out.println(lista);
            }
            if(nimi.equals("lopeta")){
                System.out.println("Nimet: " + lista);
                break;
            }
        }
            
    }
}

