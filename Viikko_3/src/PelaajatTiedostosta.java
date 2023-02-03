import java.util.Random;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;



public class PelaajatTiedostosta {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
       
        System.out.println("Testataan tiedoston lukua...");
        ArrayList<String> p = luePelaajat();
        System.out.println("Pelaajat listassa:");
        for (String pelaaja : p) {
            System.out.println(pelaaja);
        }
    }
/*Tiedostossa pelaajat.txt on pelaajien nimiä, yksi nimi jokaisella rivillä.

Kirjoita metodi

ArrayList<String> luePelaajat()

joka lukee tiedoston sisällön ja tallentaa sen listaan siten, että jokainen nimi on yksi alkio listassa. Lopuksi lista palautetaan. */
    
    public static ArrayList<String> luePelaajat(){
        File tiedosto = new File("pelaajat.txt");
        ArrayList<String> pelaajat = new ArrayList<>();

        try(Scanner lukija = new Scanner(tiedosto)){

            while(lukija.hasNextLine()){
                pelaajat.add(lukija.nextLine());
            }


        } catch(Exception e){
            System.out.println("Tapahtui Virhe!");
        }
        
        return pelaajat;
    }



}
