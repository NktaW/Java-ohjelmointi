import java.util.Random;
import java.util.ArrayList;

public class MuodostaLista {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4}, {100,106}, {5,0}, {90,80}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1]);
            System.out.println(muodostaLista((Integer) pa[0], (Integer) pa[1]));
            System.out.println("");
        }
    }
/*Kirjoita metodi 

ArrayList<Integer> muodostaLista(int alku, int loppu)

...joka saa parametrikseen listan alku- ja loppuarvot. Metodi muodostaa uuden listan, jossa on järjestyksessä kaikki alkiot annettujen pisteiden väliltä yhden askeleen välein.
    
Tuttuun tapaan alkualkio on listassa mukana, mutta loppualkio ei.

Huomaa, että lista pitää mudostaa takaperin, jos alkualkio on suurempi kuin loppualkio. Katso mallia esimerkkisuorituksista. */
 
    public static ArrayList<Integer> muodostaLista(int alku, int loppu){
        ArrayList<Integer> lista = new ArrayList<>();

        if(alku < loppu){
            for (int i = alku; i <= loppu -1; i++){
                //if(alku < loppu){
                    lista.add(i);
                //}
            }
        }
        if(alku > loppu){
            for (int i = alku; i >= loppu +1; i--){
                //if(alku > loppu){
                    lista.add(i);
                //}
            }
        }

        return lista;
    }
    
}
