import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

/*Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaislukuja. Ohjelma lisää käyttäjän syöttämät luvut listaan syöttöjärjestyksessä. 

Kun käyttäjä syöttää luvun -1, ohjelman suoritus päättyy ja ohjelma tulostaa listan.

Jos käyttäjä syötteessä on jotain muuta kuin numeroita, ohjelma jättää syötteen huomiotta. */


public class LisaaLuvutListaan {
    public static void main(String[] args){
        final Random r = new Random();

        ArrayList<Integer> luvut = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
    
            while(true){

                try {
                    System.out.print("Anna luku: ");
                    int luku = Integer.valueOf(lukija.nextLine());

                    if (luku != -1){
                        luvut.add(luku);
                    }

                    if(luku == -1){
                        System.out.println(luvut);
                    break;
                    }
                    
                } 
                catch (Exception e) {
                }
            }
    } 
    
}

