import java.util.Random;

public class Laskukone {
    public static void main(String[] args){
        final Random r = new Random();
        
        
        Object[][] p = {{1,4,"+"}, {121,145,"-"}, {5,8,"*"}, {9,3,"/"}, {99,77,"-"}, 
            {2,4,"*"}, {20,5,"/"}, {1,2,"-"}, {9,3,"*"}};
        for (Object[] pa : p) {
            System.out.print("Testataan parametreilla ");
            System.out.println(pa[0] + ", " + pa[1] + ", " + pa[2]);
            int tulos = laske((Integer) pa[0], (Integer) pa[1], (String) pa[2]);
            System.out.println("Tulos: " + tulos);
            System.out.println("");
        }
    }

    /*Kirjoita metodi 

    int laske(int luku1, int luku2, String operaattori)

    ...joka saa parametrikseen kaksi kokonaislukua ja merkkijonon. Merkkijonolla on neljä mahdollista arvoa: "+", "-", "*" tai "/"

    Metodi laskee ja palauttaa operaattorin mukaisen laskutoimituksen luvuille. */
    
    public static int laske(int luku1, int luku2, String operaattori){
        if(operaattori.equals("+")){
            return luku1 + luku2;
        }
        if(operaattori.equals("-")){
            return luku1 - luku2;
        }
        if(operaattori.equals("*")){
            return luku1 * luku2;
        }
        if(operaattori.equals("/")){
            return luku1 / luku2;
        }
        return 0;
    }



}
