import java.util.Random;


public class PalautaKeskimmainen {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4,3}, {121,145,94}, {20,30,40}, {9,7,8}, {99,77,88}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1] + ", " + pa[2]);
            System.out.print("Keskimmäinen: ");
            System.out.println(keskimmainen((Integer) pa[0], (Integer) pa[1], (Integer) pa[2]));
            System.out.println("");
        }
    }
/*
Kirjoita metodi 

keskimmainen

...joka saa parametrikseen kolme kokonaislukua. Metodi palauttaa luvuista suuruusjärjestyksessä keskimmäisen.
 */

public static int keskimmainen(int a, int b, int c) {
    if ((a < b && b < c) || (c < b && b < a))
            return b;

    else if ((b < a && a < c) || (c < a && a < b))
            return a;

    else
        return c;       
}

}
