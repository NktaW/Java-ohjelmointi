import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class PoistaNegatiivisetLuvut {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[][] s = {{1,-2,3}, {10,-20,30,-40}, {-2,4,-6,8,-10}, {-9,-1,-8,2,7,3,-6,-4}};
        
        for (int[] pa : s) {
            ArrayList<Integer> lista = new ArrayList<>();
            for (int l : pa) lista.add(l);
            
            System.out.println("Lista ennen: ");
            System.out.println("" + lista);
            System.out.println("Lista jälkeen: ");
            poistaNegatiiviset(lista);
            System.out.println(lista);
            System.out.println("");
            
        }
    }

    /*Kirjoita metodi

void poistaNegatiiviset(ArrayList<Integer> luvut) 

...joka poistaa listasta kaikki nollaa pienemmät luvut.

Vinkki: for-silmukka ei välttämättä toimi luotettavasti,
jos iteroitava rakenne muuttuu silmukan suorituksen aikana - kannattaa käyttää ennemmin jotain muuta tapaa listan läpikäyntiin.
 */
    
    public static void poistaNegatiiviset(ArrayList<Integer> luvut){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i  < luvut.size(); i++){
            if(luvut.get(i) < 0){
                lista.add(luvut.get(i));
            }
        }
        luvut.removeAll(lista);
            //System.out.println(luvut.get(i++));
            //lista.add(luvut.get(i++));
            //System.out.println(lista);
        }


    }

