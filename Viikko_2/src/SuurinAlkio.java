import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SuurinAlkio {
    public static void main(String[] args){
        final Random r = new Random();
        
        testaa(new int[]{4,20,3,6,7,8,9,11,13,16,17});
        testaa(new int[]{1,5,2,4,3,6,4,7,5,8,6,3,9,5,3});
        testaa(new int[]{-5,-4,-1,-2,-3,-6,-7});
        
        int pituus = r.nextInt(10) + 10;
        int[] l = new int[pituus];
        for (int i=0; i<pituus; i++) {
            l[i] = (100 - r.nextInt(200));
        }
        testaa(l);
        
        
    }
    
    public static void testaa(int[] l) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int a : l) {
            lista.add(a);
        }
        System.out.println("Testataan listalla " + lista);
        System.out.println("Suurin alkio: " + suurinAlkio(lista));
        System.out.println("");
    }
    
    /*Kirjoita metodi

    int suurinAlkio(ArrayList<Integer> luvut)

    joka palauttaa kokonaislukulistassa luvut olevista alkioista suurimman. */

    public static int suurinAlkio(ArrayList<Integer> luvut){
        //int suurin = 0;
        //suurin = suurin + Collections.max(luvut);
        //return suurin;
        int suurin = 0;
        for(int i = 0; i< luvut.size(); i++){
            if(luvut.get(i) > suurin){
                suurin = luvut.get(i);
            }
        }
        return suurin;
    }




}
