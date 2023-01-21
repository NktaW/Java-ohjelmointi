import java.util.Random;

public class TulostaKeskimmainen {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4,3}, {121,145,94}, {20,30,40}, {9,7,8}, {99,77,88}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1] + ", " + pa[2]);
            tulostaKeskimmainen((Integer) pa[0], (Integer) pa[1], (Integer) pa[2]);
            System.out.println("");
        }
    }

    /*Kirjoita metodi 

tulostaKeskimmainen

...joka saa parametrikseen kolme kokonaislukua. Metodi tulostaa luvuista suuruusjärjestyksessä keskimmäisen.

Jos metodi parametrit esimerkiksi olisivat 1, 3 ja 2, metodi tulostaisi luvun 2. */

    public static void tulostaKeskimmainen(int x, int y, int z) {
        if((x < y && y < z || z < y && y < x )) {
            System.out.println(y);
    }   else if((y < x && x < z || z < x && x < y )){
            System.out.println(x);
    }   else{
            System.out.println(z);
        }
    }
    


}
