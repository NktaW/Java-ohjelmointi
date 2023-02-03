import java.util.Random;

import javax.swing.JSpinner.NumberEditor;
import javax.swing.SpringLayout.Constraints;

import java.util.ArrayList;
import java.util.HashSet;

public class ArvoLottonumerot {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        System.out.println("Testataan...");
        
        ArrayList<Integer> nrot1 = lottonumerot(r);
        ArrayList<Integer> nrot2 = lottonumerot(r);
        
        System.out.println("Numerot: " + nrot1);
        System.out.println("");
        
        System.out.print("Listassa 7 numeroa: ");
        System.out.println(nrot1.size() == 7 ? "Ok" : "Ei");
        
        boolean limit = true;
        for (int nro : nrot1) {
            if (nro < 1 || nro > 39) limit = false;
        }
        System.out.print("Numerot 1 ja 39 välillä: ");
        System.out.println(limit ? "Ok" : "Ei");
        
        HashSet<Integer> hs = new HashSet<>(nrot1);
        boolean same = hs.size() == 7;
        System.out.print("Kaikki numerot uniikkeja: ");
        System.out.println(same ? "Ok" : "Ei");
        
        boolean diff = !(nrot1.equals(nrot2));
        System.out.print("Satunnaiset numerot: ");
        System.out.println(diff ? "Ok" : "Ei");
        
        
        
    }

/* 
Ohjelmassa on annettu valmiina seuraava metodimäärittely:

ArrayList<Integer> lottonumerot(Random arpoja)

Kirjoita metodille toteutus, jossa metodi palauttaa listassa lottonumerot. Numeroita on seitsemän, ja ne ovat väliltä [1, 39].

Sama numero ei voi esiintyä listassa kahta kertaa.
*/

    public static ArrayList<Integer> lottonumerot(Random r) {
        ArrayList<Integer> lotto = new ArrayList<>();

        while(lotto.size()!=7){
            int luku = r.nextInt(39)+1;
            if(!lotto.contains(luku)){
                lotto.add(luku);
            }
        }
        return lotto;
    }

    
}
