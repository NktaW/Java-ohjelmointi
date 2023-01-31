import java.util.Random;
import java.util.ArrayList;

public class LisaaSummaListaan {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        int[][] s = {{1,2,3}, {10,20,30,40}, {2,4,6,8,10}, {9,1,8,2,7,3,6,4}};
        
        for (int[] pa : s) {
            ArrayList<Integer> lista = new ArrayList<>();
            for (int l : pa) lista.add(l);
            
            System.out.println("Lista ennen: ");
            System.out.println("" + lista);
            System.out.println("Lista jälkeen: ");
            lisaaSumma(lista);
            System.out.println(lista);
            
        }
    }
    /*Kirjoita metodi

    void lisaaSumma(ArrayList<Integer> luvut) 

    ...joka laskee listassa olevien lukujen summan ja lisää sen listan viimeiseksi alkioksi. */

    public static void lisaaSumma(ArrayList<Integer> luvut){
        int luku = 0;
      for(int i = 0; i < luvut.size(); i++) {
        luku = luku + luvut.get(i);
        //System.out.println(luku);
      }
      luvut.add(luku);
    }
    
    
}
