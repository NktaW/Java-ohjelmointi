import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ToiseksiPienin {
    
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[][] s = {{3,2,1,4}, {10,20,40,50,30,60}, {9,7,5,3,8,6,4,2}, {25,5,20,15,10}};
        
        for (int[] pa : s) {
            ArrayList<Integer> lista = new ArrayList<>();
            for (int l : pa) lista.add(l);
            
            System.out.println("Lista ennen: ");
            System.out.println("" + lista);
            System.out.println("Toiseksi pienin:" + toiseksiPienin(lista));
            System.out.println("Lista jälkeen: ");
            System.out.println(lista);
            System.out.println("");
            
        }
    }
    /*Kirjoita metodi

int toiseksiPienin(ArrayList<Integer> luvut)

...joka palauttaa listan toiseksi pienimmän alkion.
Metodi ei saa muuttaa listan alkioiden järjestystä. */

    public static int toiseksiPienin(ArrayList<Integer> luvut){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < luvut.size(); i++){
            lista.add(luvut.get(i));

        }
        Collections.sort(lista);
        return (lista.get(1));

    }

}
