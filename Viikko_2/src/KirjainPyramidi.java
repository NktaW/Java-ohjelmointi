import java.util.Random;
import java.util.Scanner;

public class KirjainPyramidi {
    public static void main(String[] args){
        final Random r = new Random();

    Scanner lukija = new Scanner(System.in);
    System.out.print("Anna merkkijono: ");
    String sana = lukija.nextLine();
    
    /*Kirjoita ohjelma, joka pyytää käyttäjää syöttämään merkkijonon.
    Ohjelma tulostaa sitten merkkijonon mukaisen kirjainkolmion alla näkyvien esimerkkitulosteiden mukaisesti.
Anna merkkijono: heippa
h
he
hei
heip
heipp
heippa  */
    
    for (int i = 1; i <= sana.length(); ++i){
        System.out.println(sana.substring(0, i));

    }


    
    }  
    
}
