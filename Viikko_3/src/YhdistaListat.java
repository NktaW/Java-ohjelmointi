import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class YhdistaListat {
    public static void main(String[] args){
        final Random r = new Random();
        
        testaa(new int[]{1,3,5,7,9}, new int[]{2,4,6,8,10});
        testaa(new int[]{10,20,30,40,50,60}, new int[]{70,80,90,100,110});
        testaa(new int[]{1,11,21,31,41}, new int[]{2,3,4,32,33,34,42});

        
        
    }
    
    public static void tulosta(ArrayList<String> lista) {
        System.out.print("[\"");
        System.out.print(String.join("\", \"", lista));
        System.out.println("\"]");
    }
    
    public static void testaa(int[] l1, int[] l2) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        for (int a : l1) {
            lista1.add(a);
        }
        
        ArrayList<Integer> lista2 = new ArrayList<>();
        for (int a : l2) {
            lista2.add(a);
        }
        
        System.out.println("Testataan listoilla ");
        System.out.println("" + lista1);
        System.out.println("" + lista2);
        System.out.println("Yhdistettynä: ");
        System.out.println(yhdista(lista1, lista2));
        System.out.println("");
    }
    
/*Kirjoita metodi

ArrayList<Integer> yhdista(ArrayList<Integer> lista1, ArrayList<Integer> lista2)

joka saa parametrikseen kaksi kokonaislukuja sisältävää listaa. Listat on järjestetty nousevaan järjestykseen (eli pienin luku on ensimmäisenä ja suurin viimeisenä).

Metodi palauttaa uuden kokonaislukutyyppisen listan, johon on yhdistetty kaikki parametrilistojen alkiot. Myös uudessa listassa alkiot on järjestetty suuruusjärjestykseen. */

public static ArrayList<Integer> yhdista(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
    ArrayList<Integer> yhdistettyLista = new ArrayList<>();

    for(int i : lista1){
        yhdistettyLista.add(i);
    }
    for (int j : lista2){
        yhdistettyLista.add(j);
    }
    Collections.sort(yhdistettyLista);
    return yhdistettyLista;
}



}
