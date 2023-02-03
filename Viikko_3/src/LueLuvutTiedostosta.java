import java.util.Random;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class LueLuvutTiedostosta {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Tiedosto:");
        for (String s : syote) {
            System.out.println("" + s);
        }
        
        
        ArrayList<String> lista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
       
        System.out.println("Testataan tiedoston lukua...");
        ArrayList<Integer> p = kaikkiArvot();
        System.out.println("Kaikki arvot:");
        for (int arvo : p) {
            System.out.println(arvo);
        }
       
    }

/*Kirjoita metodi

ArrayList<Integer> kaikkiArvot()

joka lukee luvut tiedostosta, ja tallentaa ne listaan. Lopuksi lista palautetaan. */

    public static ArrayList<Integer> kaikkiArvot(){
        ArrayList<Integer> lista = new ArrayList<>();

        File tiedosto = new File("luvut.csv");

        try(Scanner lukija = new Scanner(tiedosto)){

            while(lukija.hasNextLine()){
                String rivi = lukija.nextLine();
                String[] luvut = rivi.split(",");

                for(String numero : luvut){
                    int luku = Integer.valueOf(numero);
                    lista.add(luku);
                }
            }   
        }
        catch(FileNotFoundException e){
            System.out.println("Tapahtui virhe");
        }
        return lista; 
    }

}
