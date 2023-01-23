import java.util.Random;
import java.util.Scanner;

/*Kirjoita ohjelma, joka pyytää käyttäjää syöttämään kokonaisluvun.
Ohjelma tulostaa kakkosen potensseja. jotka ovat pienempiä kuin annettu yläraja.

Käytännössä ohjelma siis tulostaa lukuja sarjasta 1, 2, 4, 8...jne. */


public class KakkosenPotenssit {
    public static void main(String[] args){
        final Random r = new Random();

    Scanner lukija = new Scanner(System.in);

    System.out.print("Anna yläraja: ");
    int luku = Integer.valueOf(lukija.nextLine());
        
    for(int i = 1; i<luku; i*=2){
        System.out.println(i+"");
    }
          


    }
}
